public class Televisor {
//    turnOn()- włącza telewizor
//    turnOff()- wyłącza telewizor
//    showStatus()- wyświetla informację, czy telewizor jest włączony, czy wyłączony
    String status;

    Televisor (String status) {
        this.status = status;
    }

    void turnOn() {
        status = "ON";
    }
    void turnOff() {
        status = "OFF";
    }
    void showStatus() {
        System.out.println("Status TV: " + status);
    }

}
