package tasks.task_1;

abstract class AbstractCar {
    public String model;
    public String gearBox;
    public int horsePower;
    public String wheelDrive;
    public int maxSpeed;

    void setModel(String model) {
        this.model = model;
    }

    void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    void setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
