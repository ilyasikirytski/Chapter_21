package example_abstract_factory;

import example_abstract_factory.ford.FordFactory;
import example_abstract_factory.toyota.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = getCarsFactory("toyota");
        Coupe coupe = carsFactory.createCoupe();
        Sedan sedan = carsFactory.createSedan();
        coupe.startRace();
        sedan.startRide();
    }

    public static CarsFactory getCarsFactory(String model) {
        if (model.equals("ford")) {
            return new FordFactory();
        } else if (model.equals("toyota")) {
            return new ToyotaFactory();
        }
        throw new RuntimeException("there is no factory like this");
    }
}
