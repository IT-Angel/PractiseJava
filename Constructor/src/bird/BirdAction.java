package bird;

public interface BirdAction {

    void fly();

    default void action() {
        System.out.print("action");
    }
}
