package lesson4ClassAndObject;

public class BankAccount {

    int id = 22;
    String name = "PETR";
    double balance = 22.1;

    void popolnenieScheta(double plusBalance) {
        System.out.println("Balance do popolnenya " + balance);
        System.out.println("Balance popolnenya " + plusBalance);
        balance += plusBalance;//прибавить и присовить
        System.out.println("Balance posle poplnenya " + balance);
        System.out.println();
    }
    //метод отнимает от переменной "balance"
    void snyatieSoScheta(double minusBalance) {
        System.out.println("Balance do snyatiya" + balance);
        System.out.println("Balance umenshitsa na " + minusBalance);
        balance -= minusBalance;//уменшить и присвоить
        System.out.println("Summa posle snyatia " + balance);
        System.out.println();
    }

}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount TheirAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Nick";
        MyAccount.balance = 33.5;

        HisAccount.id = 3;
        HisAccount.name = "KYK";
        HisAccount.balance = 22.2;

        YourAccount.id = 4;
        YourAccount.balance = 11.1;
        System.out.println(YourAccount.name);

        TheirAccount.popolnenieScheta(22.5);
        TheirAccount.snyatieSoScheta(44.2);

    }
}
