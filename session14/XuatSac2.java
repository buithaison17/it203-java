import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Patient {
    private String name;
    private int age;
    private String treatmentDepartment;

    public Patient(String name, int age, String treatmentDepartment) {
        this.name = name;
        this.age = age;
        this.treatmentDepartment = treatmentDepartment;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getTreatmentDepartment() {
        return treatmentDepartment;
    }
}

class XuatSac2 {
    public static void main(String[] args) {
        Map<String, List<Patient>> patientDepartments = new HashMap<>();
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lan", 10, "Tim mach"));
        patients.add(new Patient("Hung", 12, "Noi tiet"));
        patients.add(new Patient("Mai", 15, "Tim mach"));

        for (Patient patient : patients) {
            if (!patientDepartments.containsKey(patient.getTreatmentDepartment())) {
                patientDepartments.put(patient.getTreatmentDepartment(), new ArrayList<>());
            }
            patientDepartments.get(patient.getTreatmentDepartment()).add(patient);
        }

        for (Entry<String, List<Patient>> entry : patientDepartments.entrySet()) {
            System.out.println("Khoa " + entry.getKey());
            for (Patient patient : entry.getValue()) {
                System.out.println(patient.getName());
            }

        }

        String maxDept = "";
        int maxSize = 0;
        for (Map.Entry<String, List<Patient>> entry : patientDepartments.entrySet()) {
            if (entry.getValue().size() > maxSize) {
                maxSize = entry.getValue().size();
                maxDept = entry.getKey();
            }
        }

        System.out.printf("Khoa %s dang dong nhat voi %d nguoi", maxDept, maxSize);
    }
}
