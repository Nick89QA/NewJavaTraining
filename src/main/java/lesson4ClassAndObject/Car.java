package lesson4ClassAndObject;

public class Car {
    String color = "Green";
    String name = new String("Nick");// задали стрингу параметр
    String engine = "v4";

}

class CarTest {
    public static void main(String[] args) {
         Car car = new Car();
         car.color = "red";
         car.engine = "v3";

        System.out.println(car.color);
        System.out.println(car.engine);
        System.out.println("Цвет: " + car.color);
        System.out.println("Мотор: " + car.engine);
    }
}