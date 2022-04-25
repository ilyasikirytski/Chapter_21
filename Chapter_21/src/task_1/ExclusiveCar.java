package task_1;

public class ExclusiveCar extends AbstractCar {
    @Override
    public void setModel(String model) {
        super.model = model;
    }

    @Override
    public void setGearBox(String gearBox) {
        super.gearBox = gearBox;
    }

    @Override
    public void setHorsePower(int horsePower) {
        super.horsePower = horsePower;
    }

    @Override
    public void setWheelDrive(String wheelDrive) {
        super.wheelDrive = wheelDrive;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        super.maxSpeed = maxSpeed;
    }

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
