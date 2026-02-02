class User {
    final String userId;
    String username;
    String password;

    public User(String userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[id=" + userId + ", name=" + username + ", password=" + password + "]";
    }
}

class UserManager {
    static User[] users = new User[1000];
    static int index = 0;

    public static void addUser(User user) {
        if (index == 1000) {
            System.out.println("\nThem nguoi dung that bai\n");
        }
        users[index] = user;
        index++;
        System.out.println("\nThem nguoi dung thanh cong\n");
    }

    public static boolean checkLogin(String username, String password) {
        for (User user : users) {
            if (user.username.equals(username) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        User u = new User("17012006", "sonbui", "sonbui");
        UserManager.addUser(u);
        System.out.println(UserManager.checkLogin("sonbui", "sonbui"));
    }
}
