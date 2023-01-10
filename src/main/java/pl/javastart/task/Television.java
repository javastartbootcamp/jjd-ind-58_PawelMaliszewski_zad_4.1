package pl.javastart.task;

public class Television {
    boolean televisionOn;

    void turnOn() {
        televisionOn = true;
        System.out.println("Telewizor został włączony");
    }

    void turnOff() {
        televisionOn = false;
        System.out.println("Telewizor został wyłączony");
    }

    void showSatus() {
        if (televisionOn == true) {
            System.out.println("-------------Telewizor jest włączony-------------");
        } else {
            System.out.println("-------------Telewizor jest wyłączony-------------");
        }
    }
}
