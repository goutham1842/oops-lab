class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Roll Number
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter and Setter for Marks
    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks! Enter marks between 0 and 100.");
        }
    }
}

public class encaplation2 {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101, 85);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());

        // Updating student marks
        student.setMarks(95);
        System.out.println("Updated Marks: " + student.getMarks());
    }
}
