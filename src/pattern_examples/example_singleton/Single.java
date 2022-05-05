package pattern_examples.example_singleton;

public class Single {
    public static final Single INSTANCE = new Single();

    private Single() {
    }

    public void someMethod() {
        System.out.println("I am someMethod");
    }

    public static Single getInstance(){
        return INSTANCE;
    }
}
