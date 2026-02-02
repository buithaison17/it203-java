class Config {
    static final int MAX_SCORE = 10;
    static final int MIN_SCORE = 0;
}

public class Bai5 {
    public static void main(String[] args) {
        double score = 8.5;
        if (score < Config.MAX_SCORE) {
            System.out.println("Diem hop le");
        } else {
            System.out.println("Diem khong hop le");
        }

    }
}
