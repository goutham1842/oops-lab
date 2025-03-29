
abstract class Vehicle {
    String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    abstract void fuelType();

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle {
    public Car(String brand, int speed) {
        super(brand, speed);
    }

    void fuelType() {
        System.out.println(brand + " Car uses Petrol.");
    }
}


class Bike extends Vehicle {
    public Bike(String brand, int speed) {
        super(brand, speed);
    }

    void fuelType() {
        System.out.println(brand + " Bike uses Diesel.");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180);
        Vehicle bike = new Bike("Harley", 120);

        car.displayInfo();
        car.fuelType();

        System.out.println();

        bike.displayInfo();
        bike.fuelType();
    }
}
