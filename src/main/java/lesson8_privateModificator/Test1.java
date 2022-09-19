package lesson8_privateModificator;

/**
 * final значит неизменяемый мы не можем больше никак изменять
 * у final нет дефолтного значения
 */
public class Test1 {
    public final int a;

    Test1() {
        a = 10;
    }

    Test1(boolean b) {
    a = 14;
    }

    public void avc(int d) {

    }

    public String ret(String s){
        return s;
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.avc(2222);
        System.out.println(t.a);
        System.out.println(t.ret("Hi"));

    }
}

