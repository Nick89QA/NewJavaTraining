package lesson5Constructor;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    //метод увеличивает зарплату
    double increaseSalary() {
        salary *= 2;
        return salary;
    }
}

     class EmployeeTest {
        public static void main(String[] args) {
            Employee employee1 = new Employee(1, " Ivanov ", 33, 5555.6, " Invest ");
            Employee employee2 = new Employee(3," Morozow ",22,3345.5," Broker ");


            employee1.increaseSalary();
            System.out.println("Зарплата увеличилась " + employee1.salary + employee1.surname + employee1.department + employee1.age);


            employee2.increaseSalary();
            System.out.println("Зарплата увеличилась " + employee2.salary + employee2.surname + employee2.department + employee2.age);
        }
    }


