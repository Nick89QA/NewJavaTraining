package lesson8_privateModificator;

/**
 * non static переменные работают с non static методами
 * static variables принадлежит классу
 */
public class Student {
    String name;
    int course;
    static int count;
    double cc;

    public Student(String name2, int course2, double cc2) {
        count++;
        name = name2;
        course = course2;
        cc = cc2;
        System.out.println("Student " + count + " create ");
    }

    public static void showCount() {
        System.out.println();
    }

}

class StudentTest {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1, 33.2);
        System.out.println(st1.cc);
        Student st2 = new Student("Nick", 4, 11.1);
        System.out.println(st2.name);
        Student st3 = new Student("Kyk",33,34.5);
        System.out.println(st3.course);



    }
}


