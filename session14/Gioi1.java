import java.util.HashSet;
import java.util.Set;

public class Gioi1 {
    public static void main(String[] args) {
        Set<String> drugIngredients = new HashSet<>();
        drugIngredients.add("Aspirin");
        drugIngredients.add("Caffeine");
        drugIngredients.add("Paracetamol");

        Set<String> patientAllergies = new HashSet<>();
        patientAllergies.add("Penicillin");
        patientAllergies.add("Aspirin");

        // Tìm chất dây dị ứng
        Set<String> warningAllergies = new HashSet<>(drugIngredients);
        warningAllergies.retainAll(patientAllergies);

        // Tìm chất an toàn
        Set<String> safeIngredients = new HashSet<>(drugIngredients);
        safeIngredients.removeAll(patientAllergies);

        System.out.println("Canh bao di ung: " + warningAllergies.toString());
        System.out.println("Thanh phan an toan: " + safeIngredients.toString());
    }
}
