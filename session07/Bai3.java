class ScoreUtils {
    public static boolean isPass(double score) {
        return score >= 5;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        System.out.println(ScoreUtils.isPass(3));
        System.out.println(ScoreUtils.isPass(5));
        System.out.println(ScoreUtils.average(1, 2, 3));
    }
}
