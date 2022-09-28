package lesson_19_Arrays;

public class Test6 {
   public static void maxMin(double[]array) {
       double max = array[0];
       double min = array[0];
       for (int i =0;i<array.length;i++){
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
       }
       System.out.println("Минимальный элемент массива: " + min + " Максимальный элемент массива " + max);
   }

    public static void main(String[] args) {
        double[] array1 = {11.5, 33,554,33,2,332,22.4};
        maxMin(array1);
    }

}
