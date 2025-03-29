// Abstract class for Student
abstract class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Abstract method
    abstract void calculateGrade();

    void displayStudent() {
        System.out.println("Student Roll No: " + rollNumber + ", Name: " + name);
    }
}

// Regular Student class
class RegularStudent extends Student {
    double marks;

    public RegularStudent(String name, int rollNumber, double marks) {
        super(name, rollNumber);
        this.marks = marks;
    }

    void calculateGrade() {
        String grade = marks >= 90 ? "A" : marks >= 75 ? "B" : marks >= 60 ? "C" : "D";
        System.out.println(name + "'s Grade: " + grade);
    }
}

// Online Student class
class OnlineStudent extends Student {
    int quizMarks, assignmentMarks;

    public OnlineStudent(String name, int rollNumber, int quizMarks, int assignmentMarks) {
        super(name, rollNumber);
        this.quizMarks = quizMarks;
        this.assignmentMarks = assignmentMarks;
    }

    void calculateGrade() {
        double finalMarks = (quizMarks * 0.4) + (assignmentMarks * 0.6);
        String grade = finalMarks >= 90 ? "A" : finalMarks >= 75 ? "B" : finalMarks >= 60 ? "C" : "D";
        System.out.println(name + "'s Grade: " + grade);
    }
}

public class abstraction4 {
    public static void main(String[] args) {
        Student regular = new RegularStudent("John", 101, 85);
        Student online = new OnlineStudent("Emily", 102, 80, 90);

        regular.displayStudent();
        regular.calculateGrade();

        System.out.println();

        online.displayStudent();
        online.calculateGrade();
    }
}
