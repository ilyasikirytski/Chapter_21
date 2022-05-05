package tasks.task_1;

public class Truck extends AbstractCar {
    @Override
    void setModel(String model) {
        super.model = model;
    }

    @Override
    void setGearBox(String gearBox) {
        super.gearBox = gearBox;
    }

    @Override
    void setHorsePower(int horsePower) {
        super.horsePower = horsePower;
    }

    @Override
    void setWheelDrive(String wheelDrive) {
        super.wheelDrive = wheelDrive;
    }

    @Override
    void setMaxSpeed(int maxSpeed) {
        super.maxSpeed = maxSpeed;
    }

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
