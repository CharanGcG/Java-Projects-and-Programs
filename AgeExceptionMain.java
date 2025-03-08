
import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String str) {
        super(str);
    }
}

class Father {
    int fatherAge;

    Father(int fatherAge) throws WrongAge {
        this.fatherAge = fatherAge;

        if (fatherAge < 0)
            throw new WrongAge("Father's Age cannot be less than zero");

    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        this.sonAge = sonAge;

        if (sonAge < 0)
            throw new WrongAge("Son's Age cannot be less than zero");

        if (sonAge >= fatherAge)
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");

    }
}

class AgeExceptionMain {
    public static void main(String[] args) {
        System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter father's age: ");
        int fatherAge = input.nextInt();

        System.out.print("Enter son's age: ");
        int sonAge = input.nextInt();

        try {
            Son son = new Son(fatherAge, sonAge);
            System.out.println("Father's and Son's age are valid");

        } catch (WrongAge e) {
            System.out.println("Exception: " + e);
        }
    }
}

