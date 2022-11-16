package lesson_14_ForLoop;

public class Test6 {
    //метод выводит время
    public void time() {
        OUTER: for (int hour = 0;hour<=23;hour++){
            System.out.println("Начало цикла");
          INNER:  for (int minute = 0;minute<=59;minute++){
                System.out.println(hour + ":" + minute);
            }
            System.out.println("Конец цикла");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
