package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Television television = new Television();
        television.showSatus();
        television.turnOn();
        television.showSatus();
        television.turnOff();
        television.showSatus();

    }
}
