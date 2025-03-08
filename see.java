package see;
import cie.*;
import java.util.Scanner;

class Externals extends Internals
{

double[] see_marks;


void getDetails()
{

int i;
Scanner input=new Scanner(System.in);
System.out.print("Enter your name: ");
name=input.nextLine();
System.out.print("Enter your usn: ");
usn=input.nextLine();
System.out.print("Enter your semester: ");
sem=input.nextInt();
System.out.print("Enter your 5 subject cie marks: ");
for(i=0;i<5;i++)
{
cie_marks[i]=input.nextDouble();
}
System.out.print("Enter your 5 subject see marks: ");
for(i=0;i<5;i++)
{
see_marks[i]=input.nextDouble();
}

}

}