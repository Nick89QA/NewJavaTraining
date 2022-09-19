package lesson7PackageAccessModifiers;

public class OtherClass {
    public static void main(String[] args) {
        Employee em = new Employee(3344.3);
        System.out.println(em.salary);
        em.showSalary();
    }
}
