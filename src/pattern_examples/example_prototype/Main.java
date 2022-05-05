package pattern_examples.example_prototype;

public class Main {
    public static void main(String[] args) {
        Human original = new Human(18, "john");
        System.out.println(original);
        Human copy = (Human) original.copy();
        System.out.println(copy);
    }
}
