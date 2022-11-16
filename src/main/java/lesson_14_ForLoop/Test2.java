package lesson_14_ForLoop;

public class Test2 {
    /**
     * цикл выводит числа от 1-10
     * 1) int i = 0; переменная срабатывает первый и последний раз
     * 2) i< 11; если условие true то выполняется тело "sout = 1"
     * 3) i++; просходит прибавка на 1
     */
    public static void main(String[] args) {
        for (int i = 1; i < 1; i++) {
            System.out.println(i);
        }
        for (int i = 1, j = 1; i < 20; i++) {
            System.out.println(j + i);
        }
        //вызов метода "abc" в цикле for
        for (int i = 5; i < 11; i++, abc(100)) {
            System.out.println(i);
        }
        /**
         * в этом цикле идет бесконечный выводз значения 11
         */
//        for(int i =11;i<12;){
//            System.out.println(i);
//        }
        /**
         * в этом цикле идет бесконечное прибавление значения 2
         */
//        for (int i = 2; ;i++){
//            System.out.println(i);
//        }

    }

    static void abc(int n) {
        System.out.println(n);
     }
}
