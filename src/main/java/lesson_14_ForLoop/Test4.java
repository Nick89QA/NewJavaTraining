package lesson_14_ForLoop;

public class Test4 {
    public void meth ( int a) throws Exception{
        int b = 22;
        if (a == b) {
            System.out.println("Все верно");
        } else {
            System.out.println("Неверно");
        }
    }
    public static void main(String[] args) throws Exception {
        Test4 t = new Test4();
        t.meth(22);
    }

}
