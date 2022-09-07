package lesson5Constructor;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {

        System.out.println("cvet: " + color + " motor: " + engine + "skorost: " + speed);
    }
}

class CarTest {
    public static void main(String[] args) {

        Car2 c1 = new Car2();
        c1.color = "Green";
        c1.engine = "v8";
        c1.speed = 100;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(80);
        c1.showInfo();
    }
}