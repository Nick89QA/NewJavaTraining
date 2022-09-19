package lesson6_OverLoadingMethods;

/**
 * Перегруженные конструкторы имеют разный список параметров
 * Название у конструкторов одинаковое
 * Модификаторы доступа также могут быть разные
 * Для того чтобы вызвать конструктор внутри конструктора нужно укзать "this"
 * ключевое слово "this" должно находится в начале
 */

public class Employee1 {
    public Employee1(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 44.4, null);

    }

    Employee1(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    Employee1(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    public Employee1(String department2) {
        department = department2;
    }

    Employee1(int age2) {
        age = age2;
    }

    private Employee1(double salary2) {
        salary = salary2;
    }

    public void showSurname(String surname2) {
        surname = surname2;
        System.out.println("New surname is: " + surname2);
    }

    public void showId(int id2) {
        id = id2;
        System.out.println("My id is: " + id2);
    }

    public void showSalary(double salary2) {
        salary = salary2;
        System.out.println("My salary is " + salary2);
    }

    int id; //имеет значение ноль
    public String surname;
    int age;
    private double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee1 emp1 = new Employee1(2, "Petrov", 33);
        System.out.println(emp1.surname);
        Employee1 emp2 = new Employee1("Kozlov", 34);
        System.out.println(emp2.surname);
        Employee1 emp3 = new Employee1(2, "Vasilev", 44, 345000.0, "Invest");
        emp1.showSurname("Kivalov");
        emp1.showId(333);
        emp1.showSalary(34443.4);

    }
}