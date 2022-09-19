package lesson9Variables;

/**
 * st1=null; обнуляем наш обьект
 * garbage collector сам удаляет обьекты и мы не можем контролировать это
 */
public class Student {

}

class StudentTest {
    public static void main(String[] args) {
        Student st = new Student();
        Student st2 = new Student();
        Student st3;
        st3 = null;//обнуляем наш обьект
    }
}