import java.util.Scanner;

abstract class Shape {
    double x, y;

    Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(double x, double y) {
        super(x, y);
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (x * y) + " square units\n");
    }
}

class Triangle extends Shape {
    Triangle(double x, double y) {
        super(x, y);
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * x * y) + " square units\n");
    }
}

class Circle extends Shape {
    Circle(double x) {
        super(x, 0);
    }

    void printArea() {
        System.out.println("Area of Circle: " + (3.14 * x * x) + " square units\n");
    }
}

class ShapeRun {
    public static void main(String[] args) {
        System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");
        double x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length and width of Rectangle: ");
        x = input.nextDouble();
        y = input.nextDouble();
        Rectangle rectangle = new Rectangle(x, y);
        rectangle.printArea();

        System.out.println("Enter height and base of Triangle: ");
        x = input.nextDouble();
        y = input.nextDouble();
        Triangle triangle = new Triangle(x, y);
        triangle.printArea();

        System.out.println("Enter radius of Circle: ");
        x = input.nextDouble();
        Circle circle = new Circle(x);
        circle.printArea();

        input.close();
    }
}




