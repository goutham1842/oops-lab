
class Vehicle {
    String brand;

    // Vehicle constructor
    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle Constructor Called");
    }

    void display() {
        System.out.println("Brand: " + brand);
    }
}


class Car extends Vehicle {
    int speed;

    
    Car(String brand, int speed) {
        super(brand);  // Calls Vehicle constructor
        this.speed = speed;
        System.out.println("Car Constructor Called");
    }

   
    void display() {
        super.display();  // Calls superclass method
        System.out.println("Speed: " + speed + " km/h");
    }
}


class ElectricCar extends Car {
    int batteryCapacity;

        ElectricCar(String brand, int speed, int batteryCapacity) {
        super(brand, speed);  // Calls Car constructor
        this.batteryCapacity = batteryCapacity;
        System.out.println("ElectricCar Constructor Called");
    }

    
    void display() {
        super.display();  // Calls superclass method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", 200, 100);
        tesla.display();
    }
}
