class User {
    private int id;
    private String username;
    private String email;
    private String password;

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        if (email.matches("^[A-Za-z0-9-_.]+@[a-z]+\\.[a-z]+$")) {
            this.email = email;
        } else {
            System.out.println("Email khong hop le");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password.trim().isEmpty()) {
            System.out.println("Mat khau khong duoc de trong");
        } else {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}

public class Bai6 {
    public static void main(String[] args) {
        User u = new User(1, "son", "son@gmail.com", "123");
        u.setEmail("son");
        u.setPassword("");
    }
}
