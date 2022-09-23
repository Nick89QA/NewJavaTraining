package lesson_11PrimitiveTypes.homeWork;

public class Car {
    public String color;
    String engine;
    int carDoors;

    public Car(String color, String engine, int carDoors) {
        this.color = color;
        this.engine = engine;
        this.carDoors = carDoors;

    }
}


class CarTest {
    void changeDoorCount(Car c, int carDoors)  {
        c.carDoors = carDoors;
    }


    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("red","v9",2);
        Car car2 = new Car("yellow","v3",4);
        ct.changeDoorCount(car1,3);
        ct.changeColor(car1,car2);
        System.out.println("Информация о первой машине: Цвет: " + car1.color + " Мотор: " + car1.engine + " Количество дверей: " + car1.carDoors);
        System.out.println("Информация о второй машине: Цвет: " + car2.color + " Мотор " + car2.engine + " Количество дверей: " + car2.carDoors);
    }
}