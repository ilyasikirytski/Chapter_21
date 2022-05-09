package tasks.task_1;

public class TruckBuilder {
    private String model;
    private String gearBox;
    private int horsePower;
    private String wheelDrive;
    private int maxSpeed;

    TruckBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    TruckBuilder setGearBox(String gearBox) {
        this.gearBox = gearBox;
        return this;
    }

    TruckBuilder setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    TruckBuilder setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
        return this;
    }

    TruckBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Truck buildTruckCar() {
        Truck truck = new Truck();
        truck.setModel(model);
        truck.setGearBox(gearBox);
        truck.setHorsePower(horsePower);
        truck.setWheelDrive(wheelDrive);
        truck.setMaxSpeed(maxSpeed);
        return truck;
    }
}
