
/*Using concepts of Object-Oriented programming develop solution for any one application
1) Banking system having following operations :
1. Create an account 2.Deposit money 3. Withdraw money 4.Honor daily withdrawal limit
5. Check the balance 6.Display Account information.*/
import java.util.Scanner;
import java.util.Random;

public class Practical_9 {
    String name;
    String Acc_no;
    double balance;
    double dailyWithdrawLimit = 5000;
    double totalWithdrawnToday = 0;

    BankAccount(String Acc_no, double initialBalance,String name) {
        this.Acc_no = Acc_no;
        this.balance = initialBalance;
        this.name=name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && (totalWithdrawnToday + amount <= dailyWithdrawLimit)) {
            balance -= amount;
            totalWithdrawnToday += amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (totalWithdrawnToday + amount > dailyWithdrawLimit) {
            System.out.println("Withdrawal limit exceeded for today.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + Acc_no);
        System.out.println("Name of account holder: " + name);
        System.out.println("Balance: " + balance);
    }

    public static String generateAccountNumber() {
        Random random = new Random();
        StringBuilder Acc_no = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            Acc_no.append(random.nextInt(10));
        }
        return Acc_no.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Acc_no = generateAccountNumber();
        System.out.println("Generated Account Number: " + Acc_no);
        System.out.print("Enter Name of account holder: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();
        BankAccount account = new BankAccount(Acc_no, initialBalance, name);
        int choice;
        do {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}
// output
/*
 * Generated Account Number: 5781936485
 * Enter Name of account holder: Sachin
 * Enter initial balance: 1000
 * 
 * Banking System Menu:
 * 1. Deposit Money
 * 2. Withdraw Money
 * 3. Check Balance
 * 4. Display Account Information
 * 5. Exit
 * Enter your choice: 1
 * 
 * Enter deposit amount: 200
 * Deposited: 200.0
 * 
 * Banking System Menu:
 * 1. Deposit Money
 * 2. Withdraw Money
 * 3. Check Balance
 * 4. Display Account Information
 * 5. Exit
 * Enter your choice: 2
 * 
 * Enter withdrawal amount: 400
 * Withdrawn: 400.0
 * 
 * Banking System Menu:
 * 1. Deposit Money
 * 2. Withdraw Money
 * 3. Check Balance
 * 4. Display Account Information
 * 5. Exit
 * Enter your choice: 3
 * 
 * Current balance: 800.0
 * 
 * Banking System Menu:
 * 1. Deposit Money
 * 2. Withdraw Money
 * 3. Check Balance
 * 4. Display Account Information
 * 5. Exit
 * Enter your choice: 4
 * Account Number: 5781936485
 * Name of account holder: Sachin
 * Balance: 800.0
 * 
 * Banking System Menu:
 * 1. Deposit Money
 * 2. Withdraw Money
 * 3. Check Balance
 * 4. Display Account Information
 * 5. Exit
 * Enter your choice: 5
 * 
 * Exiting the system. Thank you!
 */