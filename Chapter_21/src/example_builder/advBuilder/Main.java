package example_builder.advBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        AdvPatternCar car = director.buildCar();
        System.out.println(car);
    }
}