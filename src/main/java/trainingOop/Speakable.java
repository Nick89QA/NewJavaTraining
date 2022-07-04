package trainingOop;

public interface Speakable {

    default void speak() {
        System.out.println("Hello from me");
    }
}
