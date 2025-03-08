import cie.*;
import see.*;
import java.util.Scanner;

public class Marks
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the number of students: ");
int n=input.nextInt();
Externals[] student=new Externals[n];

for(int i=0;i<n;i++)
{
student[i]=new Externals();
System.out.print("Enter details of Student 1: ");
student[i].getDetails();
}

}
}