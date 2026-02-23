interface RemoteControl {
    void powerOn();
}

public class Bai4 {
    public static void main(String[] args) {
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Den cam ung");
            }

            public void checkBattery() {
                System.out.println("Pin o dinh");
            }
        };
        smartLight.powerOn();
    }

}
