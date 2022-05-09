package tasks.task_1;

public class Car extends AbstractCar {

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", horsePower=" + horsePower +
                ", wheelDrive='" + wheelDrive + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
