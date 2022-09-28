package lesson_19_Arrays;

public class Test1 {
    public static void main(String[] args) {
       //обьявили массив
        int[] array1;
        String [] array2;
        double [] [] array3;
       //обьявили длинну массива
        array1 = new int[1];
        array2 = new String[3];
        array3 = new double[1][4];
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);
        //статическая инициализация

        array1[0] = 22;

        array2[0] = "Kyky";
        array2[1] = "Kak dela";
        array2[3] = "Что делать";

        double[] array5;
        array5 = new double[2];
        array5[0]=2.5;
        array5[1]=3.5;
        array5[2]=4.4;

    }
}
