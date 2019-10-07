public class TestTV {
    public static void main(String[] args) {
        String status = "OFF";
        Televisor tv = new Televisor(status);

        tv.showStatus();
        tv.turnOn();
        tv.showStatus();
        tv.turnOff();
        tv.showStatus();
    }

}
