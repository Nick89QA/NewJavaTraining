package lesson4ClassAndObject;

public class Student {

    int ticket = 10;
    String name = "Nick";
    String surname = "Petrov";
    int learnYear = 2022;
    int gradeMathematics = 44;
    int gradeEconomics = 45;
    int gradeEnglish = 46;


}

class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.ticket = 12;
        student1.name = "Karl";
        student1.surname = "Karlov";
        student1.learnYear = 2023;
        student1.gradeMathematics = 33;
        student1.gradeEconomics = 23;
        student1.gradeEnglish = 21;

        int middleGradeKarl = student1.gradeEconomics + student1.gradeEnglish + student1.gradeMathematics;
        System.out.println("Средняя оценка студента Карл " + middleGradeKarl / 3);

        Student student2 = new Student();

        student2.ticket = 10;
        student2.name = "OLeh";
        student2.surname = "Olehov";
        student2.learnYear = 2024;
        student2.gradeMathematics = 23;
        student2.gradeEconomics = 26;
        student2.gradeEnglish = 36;

        int middleGradeOleh = student2.gradeEconomics + student2.gradeEnglish + student2.gradeMathematics;
        System.out.println("Средняя оценка студента Олег " + middleGradeOleh / 3);

        Student student3 = new Student();

        student3.ticket = 25;
        student3.name = "Вован";
        student3.surname = "Картофан";
        student3.learnYear = 2020;
        student3.gradeMathematics = 20;
        student3.gradeEconomics = 19;
        student3.gradeEnglish = 17;
        int middleGradeVovan = student3.gradeEconomics + student3.gradeEnglish + student3.gradeMathematics;
        System.out.println("Средняя оценка студента Вован " + middleGradeVovan / 3);



    }

    }


