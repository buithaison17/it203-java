import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Kha1 {
    public static void main(String[] args) {
        Set<String> patients = new HashSet<>(Arrays.asList("Nguyễn Văn A - Yên Bái", "Trần Thị B - Thái Bình",
                "Nguyễn Văn A - Yên Bái", "Lê Văn C - Hưng Yên"));
        for (String patient : patients) {
            System.out.println(patient);
        }
    }
}
