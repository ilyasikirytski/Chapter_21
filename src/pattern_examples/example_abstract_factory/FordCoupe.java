package pattern_examples.example_abstract_factory;

public class FordCoupe implements Coupe {
    @Override
    public void startRace() {
        System.out.println("ford coupe race");
    }
}
