package lesson_19_Arrays;

public class Test5 {
    public static void main(String[] args) {
        int array[] = {1, 22, 33, 455, 555, 666,};
        int array1[] = {11, 333, 444, 55, 55, 33, 22};
        int array3[] = array1;
        System.out.println(array3 == array1);
        System.out.println(array1.equals(array));

    }
}
