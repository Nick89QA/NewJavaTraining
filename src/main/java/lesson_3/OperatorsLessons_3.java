package lesson_3;

/**
 * типы операторов
 * ЛОгические
 * Присваивания
 * Арифметические
 * Сравнения
 */
public class OperatorsLessons_3 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        System.out.println(b);
//   обьявили 3 переменных в одной строке
        int c = 3, d = 4, e = 5;
        System.out.println(c + d + e);

        int k = 11;
        int f = 3;
        int celayaChast = k / f;
        System.out.println(celayaChast);

        int ostatok = k % f;
        System.out.println(ostatok);

        int q = 5;
        int z = 4;
        int x = q - z++;//не происходит добавления на +1
        int r = q - ++z;
        System.out.println(x);
        System.out.println(z);
        System.out.println(r);

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);

        int a1 = 5;
        int b1 = 8;
        int a2 =  a1-- - --a1 + ++a1 + a1++ + a1;
        int b2 = ++b1 - b1++ + ++b1 - --b1;
        System.out.println(a2);
        System.out.println(b2);
    }
}
