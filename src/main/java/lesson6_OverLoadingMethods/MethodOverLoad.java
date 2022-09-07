package lesson6_OverLoadingMethods;

public class MethodOverLoad {

    void showInt(int a1) {
        System.out.println(a1);
        System.out.println("Data type is int");
    }

    void showBoolean(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean");

    }

    void showString(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String");
    }

    String showMore() {
        System.out.println("Data type is String");
        return "Hi how are you";
    }

    void show(String s, int a) {
        System.out.println("Метод String + int :" + s + a);
    }

    void show(int a, String s) {
        System.out.println("Метод int + String " + a + s);
    }

    void show(int a) {
        System.out.println("Метод с интовым значением " + a + "int");
    }

    void show(boolean b3, String s3) {
        System.out.println("Метод с булевым значением " + b3 + s3);
    }

}

class TestMethodOverload {
    public static void main(String[] args) {
        MethodOverLoad mo = new MethodOverLoad();
        int a = 3000;
        mo.showInt(a);
        boolean b1 = true;
        mo.showBoolean(b1);
        String s1 = "Hi everyone";
        mo.showString(s1);
        System.out.println(mo.showMore());
        mo.show("Hi", 1222);
        mo.show(true, "Hi");
        mo.show(1, "куку");

    }
}