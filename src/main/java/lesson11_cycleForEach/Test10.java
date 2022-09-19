package lesson11_cycleForEach;

/**
 * в if в скобках логическое выражение
 */
public class Test10 {
    public static void main(String[] args) {






       /////////////////////////////////////////////
        int a = 10;
        int salary = 400;
        int newSalary = 1000;
       //////////////////////////////////////////////
        if (newSalary < 200) {
            System.out.println(" Заработная плата очень низкая ");
        } else if (newSalary < 700) {
            System.out.println(" Заработная плата средняя ");
        }else if (newSalary > 5100) {
            System.out.println(" Заработная плата большая ");
        }
        else {
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
