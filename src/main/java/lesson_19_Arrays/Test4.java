package lesson_19_Arrays;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1,2,34,555,322,55,222};
        for (int i=0;i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        /**
         * метод sort идет от меньшего к большему значению
         */
        Arrays.sort(array1);
        for (int i =0;i< array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        /**
         * метод возвращает индекс в масиве
         */
        System.out.println();
       int index1 = Arrays.binarySearch(array1, 12);
        System.out.println(index1);
        System.out.println(array1.toString());
    }
}
