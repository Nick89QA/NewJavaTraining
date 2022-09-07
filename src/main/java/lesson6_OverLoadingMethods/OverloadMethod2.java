package lesson6_OverLoadingMethods;

/**
 * Метод считается overload когда он имеет
 * одинаковые имена и разный список параметров
 */

public class OverloadMethod2 {

    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public String sum(String s1, String s2) {
        return s1 + s2;
    }

    protected double sum(double a, int b) {
        System.out.println("Hi");

        return a + b;
    }
}

class OverloadMethod2Test {
    public static void main(String[] args) {
        OverloadMethod2 mo2 = new OverloadMethod2();
        int sum = mo2.sum(33, 44);
        double summ = mo2.sum(34.3, 321);
        System.out.println( "First method " + sum + " second method " + summ);

        String secondMethod = mo2.sum("Hi ","How are you ");
        System.out.println(secondMethod);
        String stringSum = mo2.sum("Hello, ", " my friend ");
        System.out.println("The sum1 is " + stringSum);
    }
}