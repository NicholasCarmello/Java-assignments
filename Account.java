//imports util class
import java.util.*;

//main header of the program
public class Account {
    //Creates private variables
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    //creates new method named account no arg constructor
    public Account() {
        double balance = 0;
        double id = 0;
    }

    //creates method named account for constructor with specialid, initialbalance and annualinterest rate 
    public Account(int speicialId, double initialBalance, double annualInterestRate) {
        balance = initialBalance;
        id = speicialId;
        this.annualInterestRate = annualInterestRate;
    }
//creates new methid baned setid which sets the id
    public void setId(int id) {

        this.id = id;
    }
    //gets the date of when the account was created
    public Date getDateCreated() {
        java.util.Date dateCreated = new java.util.Date();
        return dateCreated;
    }
    //this method sets the balance by taking balance as a parameter
    public void setBalance(double balance) {
        this.balance = balance;
    }
    //method that sets annual interest rate that takes annualinterestRate as paremeter
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //method getMonthlyInterestRate returns the monthly interest rate
    public double getMonthlyInterestRate() {
        double monthlyInterestRate = annualInterestRate / 12;
        return monthlyInterestRate;
    }
    //method returns the balance when called
    public double getBalance() {
        return balance;
    }
    //method that gets the monthly interest
    public double getmonthlyInterest() {
        double monthlyInterest = balance * (annualInterestRate / 12);
        return monthlyInterest;
    }
    //method that increases balance by the deposited amount
    public void deposit(double deposit) {
        balance += deposit;
    }
    //method that decreasdes balance by the withdraed amount
    public void withdraw(double withdraw) {
        balance -= withdraw;
    }

}