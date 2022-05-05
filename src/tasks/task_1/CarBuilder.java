package tasks.task_1;

public class CarBuilder {
    private String model;
    private String gearBox;
    private int horsePower;
    private String wheelDrive;
    private int maxSpeed;

    CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    CarBuilder setGearBox(String gearBox) {
        this.gearBox = gearBox;
        return this;
    }

    CarBuilder setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    CarBuilder setWheelDrive(String wheelDrive) {
        this.wheelDrive = wheelDrive;
        return this;
    }

    CarBuilder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car buildSerialCar() {
        Car serialCar = new Car();
        serialCar.setModel(model);
        serialCar.setGearBox(gearBox);
        serialCar.setHorsePower(horsePower);
        serialCar.setWheelDrive(wheelDrive);
        serialCar.setMaxSpeed(maxSpeed);
        return serialCar;
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
