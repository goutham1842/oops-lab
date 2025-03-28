class Employee {
    String name;
    int age;
    double salary;

    
    Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.salary = 0.0;
        System.out.println("Default Constructor: No details provided.");
    }

    
    Employee(String name) {
        this.name = name;
        this.age = 0;
        this.salary = 0.0;
    }

   
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
        this.salary = 0.0;
    }

   
    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    void showDetails() {
        System.out.println("Employee: " + name + ", Age: " + age + ", Salary: $" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();                  
        Employee e2 = new Employee("Alice");        
        Employee e3 = new Employee("Bob", 25);           
        Employee e4 = new Employee("Charlie", 30, 75000); 

      
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
        e4.showDetails();
    }
}
