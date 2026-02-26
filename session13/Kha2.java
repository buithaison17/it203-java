import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Kha2 {
    public static void main(String[] args) {
        List<String> medicines = new ArrayList<>(
                Arrays.asList("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"));
        List<String> newMedicines = new ArrayList<>();
        for (String medicine : medicines) {
            if (newMedicines.indexOf(medicine) == -1) {
                newMedicines.add(medicine);
            }
        }
        Collections.sort(newMedicines);
        for (String medicine : newMedicines) {
            System.out.println(medicine);
        }
    }
}