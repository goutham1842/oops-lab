class Student {
    String name;
    int age;
    int studentId;
    double gpa;

       Student() {
        this.name = "Not Provided";
        this.age = 0;
        this.studentId = 0;
        this.gpa = 0.0;
        System.out.println("Default Constructor: No details provided.");
    }

       Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.studentId = 0;
        this.gpa = 0.0;
    }

       Student(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = 0.0;
    }

    
    Student(String name, int age, int studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }

   
    void showDetails() {
        System.out.println("Student: " + name + ", Age: " + age + ", ID: " + studentId + ", GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student();                      
        Student s2 = new Student("Alice", 20);                   
 Student s3 = new Student("Bob", 22, 101);        
        Student s4 = new Student("Charlie", 23, 102, 3.9); 
        // Display details
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s4.showDetails();
    }
}
