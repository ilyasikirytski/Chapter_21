/*
Паттерн Builder. Разработать модель системы Автомобиль. Написать код
приложения, который будет позволять порождать как серийные автомобили,
так и автомобили по специальному заказу. Использовать шаблон.
 */
package task_1;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setModel("ford")
                .setGearBox("manual")
                .setHorsePower(100)
                .setWheelDrive("front")
                .setMaxSpeed(180)
                .buildSerialCar();
        System.out.println(car);

        ExclusiveCar exclusiveCar = new CarBuilder()
                .setModel("ferrari")
                .setGearBox("auto")
                .setHorsePower(500)
                .setWheelDrive("rear")
                .setMaxSpeed(320)
                .buildExclusiveCar();
        System.out.println(exclusiveCar);

        Truck truck = new CarBuilder()
                .setModel("truck")
                .setGearBox("auto")
                .setHorsePower(700)
                .setWheelDrive("awd")
                .setMaxSpeed(90)
                .buildTruckCar();
        System.out.println(truck);
    }
}
