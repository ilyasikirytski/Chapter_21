package example_factory_method;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("digital " + new Date());
    }
}
