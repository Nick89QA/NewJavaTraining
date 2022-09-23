package lesson_13_Switch;

public class Test1 {

}

class Student {
    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        /**
         * реализация через switch case
         */
        Student s1 = new Student(2);
        switch (s1.grade) {
            case 2:
                System.out.println("Студент двоешник");
                break;
            case 3:
                System.out.println("Студент троешник");
                break;
            case 4:
                System.out.println("Студент хорошист");
                break;
            case 5:
                System.out.println("Студент отличник");
                break;
            default:
                System.out.println("Оценка неверна");

        }


        /**
         * простая реализация через if else
         */
        Student s = new Student(5);
        if (s.grade == 2) {
            System.out.println("Студент двоешник ");
        } else if (s.grade == 3) {
            System.out.println("Студент троешник ");
        } else if (s.grade == 4) {
            System.out.println("Студент хорошист ");
        } else if (s.grade == 5) {
            System.out.println("Студент отличник ");
        } else {
            System.out.println("Оценка неверна");
        }
    }

}