
abstract class Shape {
    abstract void calculateArea();
}


class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

public class abstraction3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(4);

        rectangle.calculateArea();
        circle.calculateArea();
    }
}
