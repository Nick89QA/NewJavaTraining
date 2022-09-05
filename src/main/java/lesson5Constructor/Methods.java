package lesson5Constructor;

public class Methods {

    int sum(int a, int b, int c) {//после return ничего больше не может происходить
        int result = a + b + c;
        return result;
    }

    int sredneeArifmiches(int firstInt, int secondInt, int thirdInt) {
        int result2 = sum(firstInt, secondInt, thirdInt)/3;
        return result2;
    }

}

class Test21 {
    public static void main(String[] args) {
        Methods m = new Methods();
        int summaTrexChisel = m.sum(5, 3, 8);
        System.out.println("Сумма трех чисел " + summaTrexChisel);
        System.out.println( "Сумма среднеарифметического " + m.sredneeArifmiches(30,40,44));
    }
}
