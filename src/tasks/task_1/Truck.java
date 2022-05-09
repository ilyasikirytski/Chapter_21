package tasks.task_1;

public class Truck extends AbstractCar {

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", horsePower=" + horsePower +
                ", wheelDrive='" + wheelDrive + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
