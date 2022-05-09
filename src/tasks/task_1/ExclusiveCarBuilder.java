package tasks.task_1;

public class ExclusiveCarBuilder {
    private String model;
    private String gearBox;
    private int horsePower;
    private String wheelDrive;
    private int maxSpeed;

    ExclusiveCarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    ExclusiveCarBuilder setGearBox(String gearBox) {
        this.gearBox = gearBox;
        return this;
    }

    ExclusiveCarBuilder setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    ExclusiveCarBuilder setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
        return this;
    }

    ExclusiveCarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public ExclusiveCar buildExclusiveCar() {
        ExclusiveCar exclusiveCar = new ExclusiveCar();
        exclusiveCar.setModel(model);
        exclusiveCar.setGearBox(gearBox);
        exclusiveCar.setHorsePower(horsePower);
        exclusiveCar.setWheelDrive(wheelDrive);
        exclusiveCar.setMaxSpeed(maxSpeed);
        return exclusiveCar;
    }
}
