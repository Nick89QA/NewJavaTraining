package lesson9Variables;

public class HomeLesson9 {
    public static void abc() {
        String s1 = new String("asd");
        String s2 = new String("sfsfsf");
    }

}


class HomeLessonTest {
    public static void main(String[] args) {
        HomeLesson9 h = new HomeLesson9();
        HomeLesson9.abc();
        HomeLesson9.abc();
        String s1 = new String("ABC");
        HomeLesson9.abc();

    }
}