import java.util.Scanner;
abstract class Calculate
{
double x,y,result;
Calculate(double x,double y)
{
this.x=x;
this.y=y;
}
abstract double calc();
}

class Add extends Calculate
{
Add(double x,double y)
{
super(x,y);
}
double calc()
{
return x+y;
}
}

class Subtract extends Calculate
{
Subtract(double x,double y)
{
super(x,y);
}
double calc()
{
return x-y;
}
}

class Multiply extends Calculate
{
Multiply(double x,double y)
{
super(x,y);
}
double calc()
{
return x*y;
}
}


class Calculator
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter value of x: ");
double x=input.nextDouble();
System.out.print("Enter value of y: ");
double y=input.nextDouble();
Add add=new Add(x,y);
Subtract subtract=new Subtract(x,y);
Multiply multiply=new Multiply(x,y);
System.out.println("x + y = "+add.calc());
System.out.println("x - y = "+subtract.calc());
System.out.println("x * y = "+multiply.calc());
}
}
