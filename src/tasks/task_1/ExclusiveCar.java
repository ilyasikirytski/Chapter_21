package tasks.task_1;

public class ExclusiveCar extends AbstractCar {

    @Override
    public String toString() {
        return "ExclusiveCar{" +
                "model='" + model + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", horsePower=" + horsePower +
                ", wheelDrive='" + wheelDrive + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
