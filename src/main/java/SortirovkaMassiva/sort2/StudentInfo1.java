package SortirovkaMassiva.sort2;

import SortirovkaMassiva.Student;

import java.util.ArrayList;

public class StudentInfo1 {
    /**
     *Метод который принимает на вход ArrayList и интерфейс с boolean методом
     */
   public void testStudents(ArrayList<Student> al, StudentCheck sc) {
  for (Student s : al){
      if (sc.check(s)){ //boolean метод
          System.out.println("Студент " + s);
      }
  }
    }

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

        StudentInfo1 info1 = new StudentInfo1();
        info1.testStudents(students,new CheckOverGrade());
        System.out.println("---------------------------");
        /**
         * сортировка с помошью лямбды
         */
        info1.testStudents(students,(Student s)->{return s.age<30;});
    }
}
