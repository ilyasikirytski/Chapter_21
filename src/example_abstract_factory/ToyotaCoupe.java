package example_abstract_factory;

import example_abstract_factory.Coupe;

public class ToyotaCoupe implements Coupe {
    @Override
    public void startRace() {
        System.out.println("toyota coupe race");
    }
}
