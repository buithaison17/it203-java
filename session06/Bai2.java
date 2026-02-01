class Account {
    String username;
    String email;
    String password;

    public Account(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

    public void getInfor() {
        System.out.println("Ho va ten: " + this.username);
        System.out.println("Tai khoan: " + this.email);
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Account ac = new Account("sonbui", "sonbui@gmail.com", "sonbui");
        ac.getInfor();
        ac.changePassword("sonbui123");
        System.out.println();
        ac.getInfor();
    }
}
