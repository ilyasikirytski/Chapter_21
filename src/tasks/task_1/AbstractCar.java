package tasks.task_1;

abstract class AbstractCar {
    public String model;
    public String gearBox;
    public int horsePower;
    public String wheelDrive;
    public int maxSpeed;

    abstract void setModel(String model);

    abstract void setGearBox(String gearBox);

    abstract void setHorsePower(int horsePower);

    abstract void setWheelDrive(String wheelDrive);

    abstract void setMaxSpeed(int maxSpeed);
}
