import java.util.Scanner;

public class Gcd
{
int gcd(int a, int b)
{
int c = a % b;
while(c!=0)
{
a = b;
b = c;
c = a % b;
}
return b;
}

int gcd(int a, int b, int c)
{
return gcd(gcd(a,b),c);
}

int lcm(int a, int b)
{
return a*b/gcd(a,b);
}

int lcm(int a, int b, int c)
{
return lcm(lcm(a,b),c);
}

public static void main(String[] args)
{
Gcd g = new Gcd();
Scanner input = new Scanner(System.in);
System.out.println("GCD and LCM of numbers: \nEnter three numbers:");
int a = input.nextInt();
int b = input.nextInt();
int c = input.nextInt();
System.out.println("GCD of " + a + " and " + b + " : " + g.gcd(a,b));
System.out.println("GCD of " + c + " and " + b + " : " + g.gcd(b,c));
System.out.println("GCD of " + a + " and " + c + " : " + g.gcd(a,c));
System.out.println("GCD of " + a + " and " + b + " and " + c + " : " + g.gcd(a,b,c));
System.out.println("LCM of " + a + " and " + b + " : " + g.lcm(a,b));
System.out.println("LCM of " + c + " and " + b + " : " + g.lcm(b,c));
System.out.println("LCM of " + a + " and " + c + " : " + g.lcm(a,c));
System.out.println("LCM of " + a + " and " + b + " and " + c + " : " + g.lcm(a,b,c));

input.close();
}
}