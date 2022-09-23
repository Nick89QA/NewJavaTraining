package lesson_11PrimitiveTypes;

/**
 * при работе с примитивными типами мы испльзуем только ее значение
 */

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double multiplication(double a) {
        a = a * 2;
        return a;
    }
    public double zp2() {
        salary = salary *2;
        return salary;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Nick", 24.66);
        double d = e.multiplication(e.salary);
        System.out.println(d);
        System.out.println(e.salary);
    }
}