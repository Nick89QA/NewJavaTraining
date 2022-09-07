package lesson4ClassAndObject;


public class HomeWorkBankAccount {

    int age = 22;
    String name = " Nick";
    double balance = 100.5;

    void popolnenyeScheta(double poplnenye) {
        balance += poplnenye;
        System.out.println("Сумма до пополнения " + balance + name + " возраст " + age);
        System.out.println("");;
    }

    void snatyeSoScheta(double snatie) {
        balance -= snatie;
        System.out.println("Сумма после снятия " + balance + name);
    }
}

class TestHomeWork {
    public static void main(String[] args) {
        HomeWorkBankAccount h = new HomeWorkBankAccount();
        h.popolnenyeScheta(34.2);
        h.snatyeSoScheta(22.1);
    }
}



