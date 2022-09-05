package lesson5Constructor;

public class Cars {

    //Конструктор с параметрами
    Cars(String cvet, String motor) {
        System.out.println("Object is created");
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + " мотор машины: "+engine);
    }

    String color;
    String engine;


}

class CarTest3{

    public static void main(String[] args) {
        Cars cars = new Cars("Red", "V6");//задали конструктору параметры
        System.out.println( "Цвет машины " + cars.color);
        System.out.println( "Мощность машины " + cars.engine);
        Cars car2 = new Cars("Black", "v12");
    }
}
