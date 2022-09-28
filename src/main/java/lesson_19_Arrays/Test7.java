package lesson_19_Arrays;

public class Test7 {

    /**
     *Метод который показывает минимальный и максимальный элемент в массиве
     */
    public static void newMethod(int[] array) {
      int min = array[0];
      int max = array[0];
        for (int i =0;i<array.length;i++) {

            if (array[i]>max){
                max = array[i];
            }

            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("Максимальный элемент масива " + max + "Минимальный элемент массива " + min);
    }

    public static void main(String[] args) {
        int[] arr = {33,44,22,333,4444,22,11,1113231,433};
        newMethod(arr);
    }
}
