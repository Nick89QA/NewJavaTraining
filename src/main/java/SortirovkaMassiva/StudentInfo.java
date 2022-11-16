package SortirovkaMassiva;

import java.util.ArrayList;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Petr", 'm', 33, 1, 3.3);
        Student st2 = new Student("Ivan", 'm', 22, 2, 3.1);
        Student st3 = new Student("Masha", 'f', 24, 3, 2.2);
        Student st4 = new Student("Zhanna", 'f', 22, 4, 5.4);
        Student st5 = new Student("Igor", 'm', 35, 4, 7.5);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverGrade(students, 1.3);
        studentInfo.printStudentsUnderAge(students, 80);
        studentInfo.printStudentsMixConditions(students, 7.5, 35, 'm');
    }

    /**
     * метод который берет с arrayList грейд студентов
     */
    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
        for (Student s : al) {
            if (s.AverGrade > grade) {
                System.out.println("Грейд студента " + s);
            }
        }
    }

    /**
     * метод который берет с arrayList возраст студентов
     */
    void printStudentsUnderAge(ArrayList<Student> al, int age) {
        for (Student s : al) {
            if (s.age < age) {
                System.out.println("Возраст студента " + s);
            }
        }
    }

    /**
     * метод который берет с arrayList возраст, грейд и пол студентов
     */
    void printStudentsMixConditions(ArrayList<Student> al, double grade, int age, char sex) {
        for (Student s : al) {
            if (s.age < age && s.AverGrade < grade && s.sex == sex) {
                System.out.println("Грейд, возраст, пол студентов " + s);
            }
        }
    }
}
