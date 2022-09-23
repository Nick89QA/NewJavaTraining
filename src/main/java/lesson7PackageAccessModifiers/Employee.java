package lesson7PackageAccessModifiers;

/**
 * модификатор "public" виден внутри пакета, класса и внутри другого пакета
 * модификатор "private" виден внутри класса
 * модификатор "default" виден внутри пакета
 * модификатор "protected" = "default" будет виден внутри пакета + виден для наследников
 */

public class Employee {
     double salary;

    public void showSalary() {
        System.out.println("Novaya z/p= " + salary * 2);
    }

    public Employee(double salary2) {
        salary = salary2;

    }

    public static void main(String[] args) {
        Employee em = new Employee(3344.3);
        System.out.println(em.salary);
        em.showSalary();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee em = new Employee(3344.3);
        System.out.println(em.salary);
        em.showSalary();
    }
}
