package lesson9Variables;


/**
 * Локальные переменные те которые созданы внутри метода не видны вне метода
 * Область видимости локал переменных очень маленькая
 * static переменная доступна во всем классе
 * Object переменная которая создана внутри класса
 * нельзя использовать this в статических методах
 */
public class Car {

    String color;
    int a = 10;
    String engine;
    static int count;

    Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    void changeColor1(String color) {

        System.out.println("Измененный цвет машины " + color);
    }

    public void showColor() {
        int a = 500;
        System.out.println("Цвет машины: " + color);
    }

    public void changeColor(String color3) {
        System.out.println("Цвет машины изменился");
        int cena = 0;
        color = color3;
        cena += 1000;
    }

}

class CarTest1 {
    public static void main(String[] args) {
        Car c = new Car("Red", "v6");
        System.out.println(c.color);
        c.changeColor1("Blue");

    }
}
