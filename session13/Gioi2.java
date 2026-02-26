import java.util.LinkedList;
import java.util.List;

class EmergencyRoom {
    private static List<String> patients = new LinkedList<>();

    public static void patientCheckIn(String name) {
        patients.add(name);
        System.out.printf("Truong hop thuong them benh nhan %s vao cuoi danh sach\n", name);
    }

    public static void emergencyCheckIn(String name) {
        patients.add(0, name);
        System.out.printf("Truong hop khan cap them banh nhan %s vao dau danh sach\n", name);
    }

    public static void treatPatient() {
        if (patients.isEmpty()) {
            System.out.println("Danh sach ben nhan trong");
            return;
        }
        System.out.printf("Dang kham cho benh nhan %s\n", patients.getFirst());
        patients.remove(0);
    }
}

class Gioi2 {

    public static void main(String[] args) {
        EmergencyRoom.patientCheckIn("Son Bui");
        EmergencyRoom.emergencyCheckIn("Thai Son");
        EmergencyRoom.treatPatient();
        EmergencyRoom.treatPatient();
    }
}