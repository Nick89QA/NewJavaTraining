package lesson11_cycleForEach;

/**
 * в if в скобках логическое выражение
 * внутри скобок можно задать локальные переменные
 */
public class Test10 {

    void abc() {
        String str;
        int a = 10;

    }

    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            System.out.println("Максимум - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            System.out.println("Максимум - " + i2);
        } else {
            System.out.println("Максимум - " + i3);
        }
    }


    public static void main(String[] args) {

        int a = 111;
        int b = 333;
        /**
         * тернарный оператор (boolean expression) ? (if true присвоится "a") : (if false присвоится "b")
         */
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);

        Test10 t = new Test10();
        t.maximum(33, 22, 1);

        /////////////////////////////////////////////
        int a1 = 10;
        int salary = 400;
        int newSalary = 1000;
        //////////////////////////////////////////////
        if (newSalary < 200) {
            System.out.println(" Заработная плата очень низкая ");
        } else if (newSalary < 700) {
            System.out.println(" Заработная плата средняя ");
        } else if (newSalary > 5100) {
            System.out.println(" Заработная плата большая ");
        } else {
            System.out.println(" Заработная плата норм ");
        }
        //////////////////////////////////////////////
        if (a > 8) {
            System.out.println("A больше " + a);
        } else {

            System.out.println("А равно " + a);
            System.out.println("Hi");
        }
        //////////////////////////////////////////////
        if (salary >= 500) {
            System.out.println(" :) ");
        } else {
            System.out.println(" :( ");
            System.out.println("All will be Ok");
        }
        //////////////////////////////////////////////

    }
}
