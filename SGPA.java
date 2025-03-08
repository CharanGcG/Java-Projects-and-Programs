import java.util.Scanner;

class Student {
    String usn, name;
    int n;
    int marks[];
    int credits[];

    void inputMarks() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USN: ");
        usn = input.nextLine();
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter number of subjects: ");
        n = input.nextInt();
        credits = new int[n];
        marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter marks of subject " + (i + 1) + " : ");
            marks[i] = input.nextInt();
            System.out.print("\nEnter credits of subject " + (i + 1) + " : ");
            credits[i] = input.nextInt();
        }

    }

    int gradePoints(int marks) {
        if (marks >= 90)
            return 10;
        else if (marks >= 80)
            return 9;
        else if (marks >= 70)
            return 8;
        else if (marks >= 60)
            return 7;
        else if (marks >= 50)
            return 6;
        else
            return 0;
    }

    double sgpa() {
        double totalcredits = 0, sum = 0;

        for (int i = 0; i < n; i++) {
            totalcredits = totalcredits + credits[i];
            sum = sum + gradePoints(marks[i]) * credits[i];
        }

        return (sum / totalcredits);
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }
}

class SGPA {
    public static void main(String[] args) {
        System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");
        Student student = new Student();
        student.inputMarks();
        student.display();
        System.out.println("SGPA: " + student.sgpa());
    }
}


