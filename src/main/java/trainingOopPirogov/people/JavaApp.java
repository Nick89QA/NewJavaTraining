package trainingOopPirogov.people;

public class JavaApp {

    public static void main(String[] args) {
        Man ivan = new Man("Ivan");
        Man igor = new Man("Igor");
        Woman woman = new Woman ("Masha");


        igor.sayHello();

        ivan.sayHello();
        woman.sayHello();

        System.out.println(igor);

    }

}
