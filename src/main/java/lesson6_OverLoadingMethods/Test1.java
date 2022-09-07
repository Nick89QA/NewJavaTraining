package lesson6_OverLoadingMethods;

public class Test1 {

    int summOfNumbers(int a, int b, int c) {

        return a * b * c;
    }

  int sredArifmetich(int a, int b, int c) {

        return summOfNumbers(a, b, c)/4;
  }

}

class Test2 {

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.summOfNumbers(22, 23, 45));
        System.out.println(t.sredArifmetich(555,333,211));
    }
}
