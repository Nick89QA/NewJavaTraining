package lesson8_privateModificator;

public class TaskOne {

    static double multiply(double a, double b, double c) {
        return a * b * c;
    }

   static void division(int a, int b) {
       System.out.println(" Целое частное = " + a/b + " Остаток = " + a % b);
   }
}

class TaskOneTest {
    public static void main(String[] args) {
        System.out.println(TaskOne.multiply(33, 44, 11));
        TaskOne.division(44,11);
        System.out.println(TaskOne.multiply(22.3,1112.2,44.5));
        TaskOne.division(66, 5);

    }

}