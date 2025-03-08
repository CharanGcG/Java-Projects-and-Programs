import java.util.Scanner;

class Quad {
    double a, b, c;

    Quad(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calc() {
        double d = b * b - 4 * a * c;
        double root1, root2;

        if (a == 0) {
            System.out.println("Please enter valid quadratic equation");
        }

        else {
            if (d == 0) {
                System.out.println("Roots are real and equal:");
                System.out.println("Root1 = Root2: " + (-b / 2 * a));
            }

            else if (d > 0) {
                System.out.println("Roots are real and distinct:");
                root1 = (-b + Math.sqrt(d)) / (2 * a);
                root2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("Root1: " + root1 + "\nRoot2: " + root2);

            } else {
                root1 = (-b) / (2 * a);
                root2 = Math.abs(d) / (2 * a);
                System.out.println("Roots are imaginary: ");
                System.out.println("Root1: " + root1 + " +i " + root2);
                System.out.println("Root2: " + root1 + " -i " + root2);

            }
        }
    }
}

class Quadrun {
    public static void main(String[] args) {
        System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();
        Quad quadratic = new Quad(a, b, c);
        quadratic.calc();
        input.close();
    }
}