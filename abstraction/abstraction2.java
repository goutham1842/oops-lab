
abstract class Employee {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    abstract void calculateSalary();

    void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}


class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println(name + "'s Monthly Salary: $" + monthlySalary);
    }
}


class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println(name + "'s Salary for " + hoursWorked + " hours: $" + salary);
    }
}

public class abstraction2 {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("Alice", 101, 5000);
        Employee partTime = new PartTimeEmployee("Bob", 102, 20, 15);

        fullTime.displayEmployee();
        fullTime.calculateSalary();

        System.out.println();

        partTime.displayEmployee();
        partTime.calculateSalary();
    }
}
