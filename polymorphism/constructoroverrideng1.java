
class Employee {
    String name;
    double salary;

 
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee Constructor Called");
    }

    void showDetails() {
        System.out.println("Employee: " + name + ", Salary: $" + salary);
    }
}


class Manager extends Employee {
    String department;

       Manager(String name, double salary, String department) {
        super(name, salary);  // Calls Employee constructor
        this.department = department;
        System.out.println("Manager Constructor Called");
    }

    void showDetails() {
        super.showDetails();  // Calls superclass method
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 80000, "IT");
        mgr.showDetails();
    }
}
