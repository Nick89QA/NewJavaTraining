package lesson_14_ForLoop;

import lesson_19_Arrays.Test7;

public class Test7Test {

    public void time() {
        OUTER:
        for (int hours = 0; hours < 6; hours++) {
            MIDDLE:
            for (int minute = 0; minute < 60; minute++) {
                 if (hours>1 && minute % 10 == 0){
                     break OUTER;
                 }
                 INNER:
                for (int seconds = 0; seconds <60; seconds++) {
                   if (seconds * hours>minute) {
                       continue INNER;
                   }
                    System.out.println(hours + ":" + minute + ":" + seconds);

                }
            }
        }

    }

    public static void main(String[] args) {
        Test7Test t = new Test7Test();
        t.time();
    }


}