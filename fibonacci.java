import java.util.Scanner;
class Fibonacci
{
    int fibonacci(int n)
    {
        if(n<=1)return n;
        else return fibonacci(n-1) + fibonacci (n-2);
    }
    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of terms of Fibonacci terms");
        int n = input.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print(f.fibonacci(i) + " ");
        }
        input.close();
    }
}