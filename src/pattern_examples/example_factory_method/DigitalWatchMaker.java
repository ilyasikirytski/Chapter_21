package pattern_examples.example_factory_method;

public class DigitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
