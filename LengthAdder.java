import java.util.Scanner;
class Length
{
double cm,mm;
Length()
{
cm=0;mm=0;
}
Length(double cm,double mm)
{
this.cm=cm;
this.mm=mm;
}
void setValues()
{
Scanner input=new Scanner(System.in);
System.out.print("Enter cm: ");
cm=input.nextDouble();
System.out.print("Enter mm: ");
mm=input.nextDouble();
input.close();
}

double addLength()
{
return cm+mm/100;
}
}


class LengthAdder
{
public static void main(String[] args)
{
Length length=new Length();
length.setValues();
System.out.print("Resultant length: "+length.addLength()+" cm");
}
}

