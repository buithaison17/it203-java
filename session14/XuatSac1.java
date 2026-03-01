import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Patient {
    private String name;
    private int severity;
    private int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}

public class XuatSac1 {
    public static void main(String[] args) {
        Comparator<Patient> comparePatients = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                if (p1.getSeverity() != p2.getSeverity()) {
                    return p1.getSeverity() - p2.getSeverity();
                }
                if (p1.getArrivalTime() != p2.getArrivalTime()) {
                    return p1.getArrivalTime() - p2.getArrivalTime();
                }
                return p1.getName().compareTo(p2.getName());
            }
        };
        Set<Patient> patients = new TreeSet<>(comparePatients);
        patients.add(new Patient("Benh nhan A", 3, 10));
        patients.add(new Patient("Benh nhan B", 1, 11));
        patients.add(new Patient("Benh nhan C", 1, 11));

        for (Patient patient : patients) {
            System.out.println(patient.getName());
        }
    }

}