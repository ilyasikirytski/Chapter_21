package example_abstract_factory.toyota;

import example_abstract_factory.CarsFactory;
import example_abstract_factory.Coupe;
import example_abstract_factory.Sedan;

public class ToyotaFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
