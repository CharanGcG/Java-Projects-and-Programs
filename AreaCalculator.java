import java.util.Scanner;

abstract class Area       //Creating an abstract class with two dimensions and an abstract calculate method
{
double dimension_1;
double dimension_2;

abstract double calculate();
}

class Square extends Area        //Concrete class Square extending class Area
{
Square(double dimension_1,double dimension_2)
{
if(dimension_1<=0 || dimension_2<=0)
{
System.out.println("Please Enter Positive values for dimensions.");
}
else
{
this.dimension_1=dimension_1;
this.dimension_2=dimension_2;
}
}

double calculate()
{
return dimension_1*dimension_2;
}
}


class Rectangle extends Area          //Concrete class Rectangle extending class Area
{
Rectangle(double dimension_1,double dimension_2)
{
if(dimension_1<=0 || dimension_2<=0)
{
System.out.println("Please Enter Positive values for dimensions.");
}
else
{
this.dimension_1=dimension_1;
this.dimension_2=dimension_2;
}
}

double calculate()
{
return dimension_1*dimension_2;
}
}


class Circle extends Area          //Concrete class Circle extending class Area
{
Circle(double dimension_1)
{
if(dimension_1<=0)
{
System.out.println("Please Enter Positive values for dimensions.");
}
else
{
this.dimension_1=dimension_1;
}
}

double calculate()
{
return 3.14*dimension_1*dimension_1;
}
}


class Triangle extends Area          //Concrete class Triangle extending class Area
{
double dimension_3;
Triangle(double dimension_1,double dimension_2,double dimension_3)
{
if(dimension_1<=0 || dimension_2<=0 || dimension_3<=0)
{
System.out.println("Please Enter Positive values for dimensions.");
}
else
{
this.dimension_1=dimension_1;
this.dimension_2=dimension_2;
this.dimension_3=dimension_3;
}
}

double calculate()
{
double semi_perimeter=(dimension_1+dimension_2+dimension_3)/2;
double intermediate=(semi_perimeter*(semi_perimeter-dimension_1)*(semi_perimeter-dimension_2)*(semi_perimeter-dimension_3));   //intermediate of Herons formula
if(intermediate<=0)            //checking if the dimesions form a valid triangle or not and displaying appropriate message
{
System.out.println("Please Enter valid dimensions of a triangle: Sum of any two sides should be greater than the third side");
return -1;
}
else
{
return Math.sqrt(intermediate);
}
}
}


class Menu    //to display menu
{
void display()
{
System.out.println("\n\nMenu:\n\nSquare: 1\nRectangle: 2\nCircle: 3\nTriangle: 4\nExit: 5\n\nEnter choice: ");
}
}

class Switching    //an infinite loop to continue the process until the user opts out of the process
{
static void loop()
{
Scanner input=new Scanner(System.in);    //Creating a Scanner object named input
while(true)
{

Menu menu=new Menu();
menu.display();
int choice=input.nextInt();
switch(choice)
{
case 1: System.out.print("Enter the length of the square: ");
double squareLength=input.nextDouble();
Square square=new Square(squareLength,squareLength);
System.out.println("\nArea of square: "+square.calculate()+" units");
break;

case 2: System.out.print("Enter the length of the rectangle: ");
double rectangleLength=input.nextDouble();
System.out.print("Enter the width of the rectangle: ");
double rectangleWidth=input.nextDouble();
Rectangle rectangle=new Rectangle(rectangleLength,rectangleWidth);
System.out.println("\nArea of rectangle: "+rectangle.calculate()+" units");
break;

case 3: System.out.print("Enter the radius of the Circle: ");
double radius=input.nextDouble();
Circle circle=new Circle(radius);
System.out.println("\nArea of circle: "+circle.calculate()+" units");
break;

case 4: System.out.print("Enter the length of side a: ");
double side_a=input.nextDouble();
System.out.print("Enter the length of side b: ");
double side_b=input.nextDouble();
System.out.print("Enter the length of side c: ");
double side_c=input.nextDouble();
Triangle triangle=new Triangle(side_a,side_b,side_c);
System.out.println("\nArea of Triangle: "+triangle.calculate()+" units");
break;

case 5: System.out.println("\nThank you for using the Area calculator. Application exited successfully");
input.close();
System.exit(0);

default: System.out.println("\nEnter the choice from the menu only.");
}
}

}
}

class AreaCalculator
{
public static void main(String[] args)
{
System.out.println("\n\nAREA CALCULATOR\n\nCALCULATE THE AREA OF BASIC SHAPES");
Switching.loop();
}
}