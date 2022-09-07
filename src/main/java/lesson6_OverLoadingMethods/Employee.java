package lesson6_OverLoadingMethods;

/**
 * Перегруженные конструкторы имеют разный список параметров
 * Название у конструкторов одинаковое
 * Модификаторы доступа также могут быть разные
 */

/**
 * Для того чтобы вызвать конструктор внутри конструктора нужно укзать "this"
 */

/**
 * ключевое слово "this" должно находится в начале
 */
class Employee {
    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 44.4, null);

    }

    Employee(String surname3, int age3) {
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id; //имеет значение ноль
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(2, "Petrov", 33);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("Kozlov", 34);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(2, "Vasilev", 44, 345000.0, "Invest");
        System.out.println(emp3.salary);

    }
}