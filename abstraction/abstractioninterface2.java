interface FuelEfficiency {
    void fuelConsumption();
}

abstract class Vehicle {
    String model;

    public Vehicle(String model) {
        this.model = model;
    }

    abstract void start();

    void stop() {
        System.out.println(model + " is stopping.");
    }
}

class Car extends Vehicle implements FuelEfficiency {
    public Car(String model) {
        super(model);
    }

    void start() {
        System.out.println(model + " starts with a key.");
    }

    public void fuelConsumption() {
        System.out.println(model + " has fuel efficiency of 15 km/l.");
    }
}

class Motorcycle extends Vehicle implements FuelEfficiency {
    public Motorcycle(String model) {
        super(model);
    }

    void start() {
        System.out.println(model + " starts with a button.");
    }

    public void fuelConsumption() {
        System.out.println(model + " has fuel efficiency of 40 km/l.");
    }
}

public class abstractioninterface2 {
    public static void main(String[] args) {
        Vehicle car = new Car("Sedan");
        car.start();
        ((FuelEfficiency) car).fuelConsumption();
        car.stop();

        Vehicle bike = new Motorcycle("Sports Bike");
        bike.start();
        ((FuelEfficiency) bike).fuelConsumption();
        bike.stop();
    }
}
