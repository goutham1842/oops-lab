
class Vehicle {
    String brand;
    int speed;


    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}


class Car extends Vehicle {
    int seats;

    
    public Car(String brand, int speed, int seats) {
        super(brand, speed); // Calling Vehicle constructor
        this.seats = seats;
    }


    public void showCarDetails() {
        showDetails(); // Calling Vehicle method
        System.out.println("Seats: " + seats);
    }
}


class SportsCar extends Car {
    String mode;

    
    public SportsCar(String brand, int speed, int seats, String mode) {
        super(brand, speed, seats); // Calling Car constructor
        this.mode = mode;
    }

    
    public void showSportsCarDetails() {
        showCarDetails(); // Calling Car method
        System.out.println("Drive Mode: " + mode);
    }
}


public class MultilevelVehicleExample {
    public static void main(String[] args) {
        // Creating a SportsCar object
        SportsCar ferrari = new SportsCar("Ferrari", 300, 2, "Sport Mode");

        // Displaying all details
        ferrari.showSportsCarDetails();
    }
}
