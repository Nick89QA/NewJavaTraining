package SortirovkaMassiva;

public class Student {
    String name;
    char sex;
    public int age;
    int course;
    public double AverGrade;

    public Student(String name, char sex, int age, int course, double averGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        AverGrade = averGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", AverGrade=" + AverGrade +
                '}';
    }
}
