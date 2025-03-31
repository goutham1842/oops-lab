class Employee {
    private String empName;
    private int empID;
    private double salary;

    // Constructor
    public Employee(String empName, int empID, double salary) {
        this.empName = empName;
        this.empID = empID;
        this.salary = salary;
    }

    // Getter and Setter for Employee Name
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter for Employee ID (No Setter since ID shouldn't change)
    public int getEmpID() {
        return empID;
    }

    // Getter and Setter for Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 3000) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be at least $3000!");
        }
    }
}

public class encaplation3 {
    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 102, 4500);

        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee ID: " + emp.getEmpID());
        System.out.println("Salary: $" + emp.getSalary());

        // Updating salary
        emp.setSalary(5000);
        System.out.println("Updated Salary: $" + emp.getSalary());

        // Attempting to set invalid salary
        emp.setSalary(2500);
    }
}
