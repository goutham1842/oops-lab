import java.util.Scanner;

class Vehicle {
String brand;
    int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void display_info() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

interface Electrical {
    public void charge();
}

interface Hybrid {
    public void switchOn();
}

class ElectricBike extends Vehicle implements Electrical, Hybrid {
    public ElectricBike(String brand, int speed) {
        super(brand, speed);
    }

    public void display_info() {
        super.display_info();
    }

    public void charge() {
        System.out.println("Electric bike will charge.");
    }

    public void switchOn() {
        System.out.println("Electric bike has two switch modes: Fuel and Electric.");
    }

    public void ecoMode() {
        System.out.println("It has the eco mode.");
    }
}

class HybridBike extends Vehicle implements Electrical, Hybrid {
    public HybridBike(String brand, int speed) {
        super(brand, speed);
    }

    public void display_info() {
        super.display_info();
    }

    public void charge() {
        System.out.println("Hybrid bike will charge.");
    }

    public void switchOn() {
        System.out.println("Hybrid bike has two switch modes: Fuel and Electric.");
    }

    public void fuelEfficiency() {
        System.out.println("Hybrid bike is fuel efficient.");
    }
}

public class hibride_1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the brand: ");
        String brand = myObj.nextLine();
        System.out.println("Enter the speed: ");
        int speed = myObj.nextInt();

        ElectricBike electricBike = new ElectricBike(brand, speed);
        electricBike.display_info();
        electricBike.charge();
        electricBike.switchOn();
        electricBike.ecoMode();

        HybridBike hybridBike = new HybridBike(brand, speed);
        hybridBike.display_info();
        hybridBike.charge();
        hybridBike.switchOn();
        hybridBike.fuelEfficiency();
    }
}
