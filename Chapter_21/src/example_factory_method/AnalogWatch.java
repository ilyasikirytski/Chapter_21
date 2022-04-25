package example_factory_method;

import java.util.Date;

public class AnalogWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Analog " + new Date());
    }
}
