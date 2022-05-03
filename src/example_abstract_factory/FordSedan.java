package example_abstract_factory;

import example_abstract_factory.Sedan;

public class FordSedan implements Sedan {
    @Override
    public void startRide() {
        System.out.println("ford sedan ride");
    }
}
