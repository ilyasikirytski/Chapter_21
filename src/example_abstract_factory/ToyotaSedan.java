package example_abstract_factory;

import example_abstract_factory.Sedan;

public class ToyotaSedan implements Sedan {
    @Override
    public void startRide() {
        System.out.println("toyota sedan ride");
    }
}
