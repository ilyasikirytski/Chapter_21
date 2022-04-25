package example_abstract_factory.ford;

import example_abstract_factory.CarsFactory;
import example_abstract_factory.Coupe;
import example_abstract_factory.Sedan;

public class FordFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
