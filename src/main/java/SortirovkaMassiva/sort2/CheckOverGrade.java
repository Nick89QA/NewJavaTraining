package SortirovkaMassiva.sort2;

import SortirovkaMassiva.Student;

public class CheckOverGrade implements StudentCheck {

    @Override
    public boolean check(Student s) {
        return s.AverGrade>6;
    }
}
