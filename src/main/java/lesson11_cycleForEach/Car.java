package lesson11_cycleForEach;

public class Car {

    int engine;
    int doorCount;

    Car(int engine, int doorCount) {
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {

    public static void main(String[] args) {
    Car c1 = new Car(3,2);
    Car c2 = new Car(11,33);

    if(c1.engine> c2.engine)
        if (c1.doorCount> c2.doorCount)
            System.out.println("Мощность мотора и количество дверей у первой машины больше");
        else {
            System.out.println("Мощность мотора и количество дверей у второй машины больше");
        }

    }
}