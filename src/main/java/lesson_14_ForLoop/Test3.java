package lesson_14_ForLoop;

public class Test3 {
    public static void main(String[] args) {
        //вывод с 1-30
        for (int i =1;i<31;i++){
            System.out.println(i);
        }
        //вывод четного числа
        for (int i=2; i<30; i=i+2){
            System.out.println(" Число " + i );
        }
//        //  compile error
//        for (int i =2;false;i=i+1){
//            System.out.println(i);
//        }
    }
}
