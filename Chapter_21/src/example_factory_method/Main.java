package example_factory_method;

public class Main {
    public static void main(String[] args) {
        WatchMaker watchMaker = getMakerByName("analog");
        Watch watch = watchMaker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String name) {
        if (name.equals("analog")) {
            return new AnalogWatchMaker();
        } else if (name.equals("digital")) {
            return new DigitalWatchMaker();
        }
        throw new RuntimeException("нет таких часов");
    }
}

