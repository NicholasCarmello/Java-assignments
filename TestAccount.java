
//imports scanner class
import java.util.Scanner;

//main header of the program
public class TestAccount {
    // main method of the program
    public static void main(String[] args) {
        // Creates new scanner object named scan
        Scanner scan = new Scanner(System.in);

        // asks the user to enter an id
        System.out.println("Enter your Id");

        // gets the users input of id
        int id = scan.nextInt();

        // asks the user to enter the balance
        System.out.println("Enter your balance");
        // gets the users balance
        double balance = scan.nextDouble();
        // gets the users annual interest rate
        System.out.println("Enter your annual interest rate");
        double annualInterestRate = scan.nextDouble()/100;

        //creates Account object named firstAccount
        Account firstAccount = new Account(id, balance, annualInterestRate);

        //asks the user how much they want to withdraw and calls withdraw method in firstAccount
        System.out.println("How much do you want to withdraw");
        firstAccount.withdraw(scan.nextDouble());

        //asks the user how much they want to deposit and calls deposit method in firstAccount object
        System.out.println("How much do you want to deposit");
        firstAccount.deposit(scan.nextDouble());

        //prints out the balance, monthly interest and the date by calling the firstAccount method
        System.out.println("The balance is " + firstAccount.getBalance());
        System.out.println("The monthly interest is " + firstAccount.getmonthlyInterest());
        System.out.println("The date is " + firstAccount.getDateCreated().toString());

    }
}