package lesson_19_Arrays;


public class Exceptions {
     static String s;
    public static void main(String[] args) {
        /**
         * ArrayIndexOutOfBoundsException = когда вышли за рамки массива
         */
        int[] array = new int[3];
       array[0] = 1;
       array[1] = 2;
       array[2] = 3;
     //  array[3] = 4;

        /**
         * NullPointerException = когда обьект null
         */
       int[][]array2= new int[3][];
       // System.out.println(array2[0][1]);
     // System.out.println(s.length());
    }
}
