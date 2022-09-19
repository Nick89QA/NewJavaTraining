package lesson8_privateModificator;

public class TaskTwo {
    public final static double PI = 3.14;

    public double ploshad(double radius) {
        double pl = PI * radius * radius;
        return pl;
    }

    public static double dlinna(double radius2) {
        double dl = 2 * PI * radius2;
        return dl;
    }

    public void info(double radius3) {
        System.out.println("Радиус = " + radius3);
        System.out.println("Площадь круга = " + ploshad(radius3));
        System.out.println("Длинна окружности = " + dlinna(radius3));
    }

}

class TaskTestTwo {
    public static void main(String[] args) {
        TaskTwo t = new TaskTwo();
        t.ploshad(44);
        TaskTwo.dlinna(22.4);
        t.info(33);


    }
}
