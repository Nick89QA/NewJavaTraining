package lesson5Constructor;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;

    void info() {
        System.out.println(" Имя: " + name + " Цвет машины: " + car.color + " Баланс банковского счета: " + ba.balance);
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Nick";
        h.car = new Car3("green", "v6");
        h.ba = new BankAccount(22, 33.6);
        h.info();
    }
}


class Car3 {
    Car3(String c, String e) {
        color = c;
        engine = e;
    }

    String color;
    String engine;

}

class BankAccount {
    BankAccount(int id2, double balance2) {
        id = id2;
        balance = balance2;
    }

    int id;
    double balance;

    void PopolnenyeScheta(int positive) {
        positive = 1;

    }

    void SnatyeSoScheta( int negative) {
        negative = 2;
    }
}
