package example_factory_method;

public class AnalogWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new AnalogWatch();
    }
}
