import java.util.Scanner;
public class AP
{
int a,d;
double g,r;
AP(int a, int d)
{
this.a = a;
this.d = d;
}
int nthTerm(int n)
{
return a+(n-1)*d;
}
int sum(int n)
{
return (n/2)*(a+nthTerm(n));
}

AP(double g, double r)
{
this.g = g;
this.r = r;
}
double nthTerm(double n)
{
return g*Math.pow(r,n-1);
}
double sum(double n)
{
return (g*(1-Math.pow(r,n))/(1-r));
}

public static void main(String[]args)
{
Scanner input =  new Scanner(System.in);
System.out.print("Arithmetic Progression:\nEnter the first term: a = ");
int a = input.nextInt();
System.out.print("Enter the common difference: d = ");
int d = input.nextInt();
AP ap = new AP(a,d);

System.out.print("Enter the number of terms: n = ");
int n = input.nextInt();
System.out.println("The first " + n + " terms: ");
for(int i = 1; i <= n; i++)
{
System.out.println(i + "th term: " + ap.nthTerm(i));
}
System.out.println("Sum of the " + n + " terms : " + ap.sum(n));


System.out.print("Geometric Progression:\nEnter the first term: a = ");
double g = input.nextDouble();
System.out.print("Enter the common ratio: r = ");
double r = input.nextDouble();
AP gp = new AP(g,r);
System.out.print("Enter the number of terms: n = ");
double n2 = input.nextDouble();
System.out.println("The first " + n + " terms: ");
for(double i = 1; i <= n2; i++)
{
System.out.println(i + "th term: " + gp.nthTerm(i));
}
System.out.println("Sum of the " + n + " terms : " + gp.sum(n2));

input.close();
}
}
