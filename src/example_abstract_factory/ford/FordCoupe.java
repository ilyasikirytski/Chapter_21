package example_abstract_factory.ford;

import example_abstract_factory.Coupe;

public class FordCoupe implements Coupe {
    @Override
    public void startRace() {
        System.out.println("ford coupe race");
    }
}