package lesson_12HomeWork;

import lesson_11PrimitiveTypes.Student;

public class HomeWork {


}

/**
 * сравниваем 2 string в методе и 2 int
 * Взяли 2 обьекта и сравнили их переменные типа int и типа String
 */
class StudentTest {
    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Студенты одинаковые");
        } else {
            System.out.println("Студенты не одинаковые");
        }
    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Имена, курсы и оценки студентов одинаковы");
                } else {
                    System.out.println("Имена студентов и курсы одинаковые, но оценки различаются");
                }
            } else {
                System.out.println("Имена студентов одинаковые, но курсы различаются");
            }

        } else {
            System.out.println("Именна студентов различаются");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 2, 5.5);
        Student s2 = new Student("Ivan", 2, 5.5);

        method1(s1, s2);
        method2(s1, s2);
    }


}


