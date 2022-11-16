package lesson_14_ForLoop;

public class Test5 {
    public static void main(String[] args) {
//        //выход из цикла когда в break поставили условие
//        for (int i = 1; i <= 10; i++) {
//            if (i == 7) {
//                break;
//            }
//            System.out.println("Число " + i);
//        }
        //оператор "continue" условие перехода
        for (int i = 2; i < 100; i++) {
            if (i == 77) {
                continue;
            }
            if (i % 66 == 0) {
                break;
            }
            System.out.println("Число " + i);
        }

    }
}
