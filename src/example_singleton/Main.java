package example_singleton;

public class Main {
    public static void main(String[] args) {
//        Single single = Single.INSTANCE;
        Single single = Single.getInstance();
        single.someMethod();
    }
}
