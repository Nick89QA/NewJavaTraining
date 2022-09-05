package lesson6_OverLoadingMethods;

public class MethodOverLoad {

    void showInt(int a1) {
        System.out.println(a1);
    }

   void showBoolean(boolean b1) {
       System.out.println(b1);

   }

   void showString(String s1) {
       System.out.println(s1);
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
    }
}