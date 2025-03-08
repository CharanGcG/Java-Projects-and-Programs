import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        input.nextLine();

        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        // Input Internal Marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of Student " + (i + 1));
            System.out.print("Enter USN: ");
            String usn = input.nextLine();
            System.out.print("Enter Name: ");
            String name = input.nextLine();
//input.nextLine();

            System.out.print("Enter Semester: ");
            int sem = input.nextInt();
            input.nextLine();
            double[] internalMarks = new double[5];
            System.out.print("Enter Internal Marks for 5 courses: ");
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = input.nextDouble();
            }
input.nextLine();

            internals[i] = new Internals(usn, name, sem, internalMarks);
        }

        // Input SEE Marks
        for (int i = 0; i < n; i++) {
            System.out.println("Enter SEE Marks for 5 courses of Student " + (i+1) + " " + internals[i].name);
            String usn = internals[i].usn;  
            String name = internals[i].name;
            int sem = internals[i].sem;
            double[] seeMarks = new double[5];
           
            for (int j = 0; j < 5; j++) {
                seeMarks[j] = input.nextDouble();
            }

            externals[i] = new External(usn, name, sem, seeMarks);
        }

        // Display Final Marks
        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " : USN: " + internals[i].usn + "\nName: " +
                    internals[i].name + "\nSemester: " + internals[i].sem);

            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + ": " +
                        ((internals[i].internalMarks[j]) + (externals[i].seeMarks[j] / 2)) + "\n");
            }
            System.out.println();
        }
    }
}


