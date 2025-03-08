import java.util.Scanner;

class Account {
        String customerName;
        long accountNumber;
        String accountType;
        double balance;

        Account(String customerName, long accountNumber, String accountType, double balance) {
                this.customerName = customerName;
                this.accountNumber = accountNumber;
                this.accountType = accountType;
                this.balance = balance;
        }

        void deposit(double amount) {
                balance = balance + amount;
                System.out.println("Deposit of " + amount + " was successful. Balance: " + balance);
        }

        void displayBalance() {
                System.out.println("\nAccount Number: " + accountNumber + "\nCustomer Name: " + customerName
                                + "\nAccount Type: " + accountType + "\nBalance: " + balance);
        }

}

class SavingsAccount extends Account {

        SavingsAccount(String customerName, long accountNumber, double balance) {
                super(customerName, accountNumber, "Savings", balance);
        }

        void interest(double rate) {
                double interest = balance * rate / 100;
                balance = balance + interest;
                System.out.println("Interest computed and deposited. Updated balance: " + balance);
        }

        void withdraw(double amount) {

                if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdrawal of " + amount + " successful. Updated balance: " + balance);
                }

                else {
                        System.out.println("Insufficient funds. Withdrawal failed.");
                }

        }

}

class CurrentAccount extends Account {
        double minimumBalance;
        double serviceCharge;

        CurrentAccount(String customerName, long accountNumber, double balance, double minimumBalance,
                        double serviceCharge) {
                super(customerName, accountNumber, "Current", balance);
                this.minimumBalance = minimumBalance;
                this.serviceCharge = serviceCharge;
        }

        void checkMinimumBalance() {
                if (balance < minimumBalance) {
                        balance = balance - serviceCharge;
                        System.out.println("Minimum balance not maintained. Service charge imposed. Updated balance: "
                                        + balance);
                } else {
                        System.out.println("Minimum balance maintained. Service charge not imposed. Updated balance: "
                                        + balance);
                }
        }

        void cheque(double amount) {

                balance = balance - amount;
                System.out.println("Withdrawal of " + amount + " successful. Updated balance: " + balance);
        }

}

public class Bank {
        public static void main(String[] args) {
                System.out.println("Name: CHARAN G\nUSN: 1BM22CS078\n\n");
                Scanner s1 = new Scanner(System.in);

                System.out.println("Savings Account: ");
                System.out.print("Enter customer name: ");
                String name = s1.nextLine();
                System.out.print("Enter account number: ");
                long no = s1.nextLong();
                System.out.print("Enter initial balance: ");
                double balance = s1.nextDouble();
                SavingsAccount SA = new SavingsAccount(name, no, balance);
                System.out.print("\n");

                System.out.println("Current Account: ");
                System.out.print("Enter customer name: ");
                name = s1.next();
                System.out.print("Enter account number: ");
                no = s1.nextLong();
                System.out.print("Enter balance: ");
                balance = s1.nextDouble();
                System.out.print("Enter minimum balance: ");
                double minBalance = s1.nextDouble();
                System.out.print("Enter service charge: ");
                double charge = s1.nextDouble();
                CurrentAccount CA = new CurrentAccount(name, no, balance, minBalance, charge);
                System.out.print("\n");

                System.out.print("Enter deposit amount for Savings Account: ");
                double SDA = s1.nextDouble();
                SA.deposit(SDA);
                System.out.print("\n");

                System.out.print("Enter interest rate for Savings Account: ");
                double SIR = s1.nextDouble();
                SA.interest(SIR);
                System.out.print("\n");

                System.out.print("Enter withdrawal amount for Savings Account: ");
                double SWA = s1.nextDouble();
                SA.withdraw(SWA);
                System.out.print("\n");

                System.out.print("Enter deposit amount for Current Account: ");
                double CDA = s1.nextDouble();
                CA.deposit(CDA);
                System.out.print("\n");

                System.out.print("Enter withdrawal amount for Current Account: ");
                double CWA = s1.nextDouble();
                CA.cheque(CWA);
                System.out.print("\n");

                CA.checkMinimumBalance();

                System.out.println("\nFinal Balances:");
                System.out.println("Savings Account:");
                SA.displayBalance();
                System.out.print("\n");

                System.out.println("\nCurrent Account:");
                CA.displayBalance();

        }
}
