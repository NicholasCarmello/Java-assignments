//imports scanner class
import java.util.Scanner;

//main header of the program
public class Binary{
    //main method of the program
    public static void main(String[] args){
        //creates scanner object
        Scanner scan = new Scanner(System.in);
        //asks user to enter a 4 digit binary number
        System.out.println("enter a 4 digit binary number");
        //gets the user input 
        String userInput = scan.nextLine();


        //declaring variables firstNumber , secondNumber, thirdNumber, Fourthnumber
int firstNumber =0;
int secondNumber=0;
int thirdNumber=0;
int fourthNumber=0;

//checks to see if any of the numbers are a 1 and if so puts a number to a variable
        if (userInput.charAt(3) == '1'){
            fourthNumber = 1;
        }
        if(userInput.charAt(2) == '1'){
            thirdNumber = 2;
        }
        if (userInput.charAt(1) == '1'){
            secondNumber = 4;
        }
        if(userInput.charAt(0) == '1'){
            firstNumber = 8;
        }
        int decimalNumber = fourthNumber + thirdNumber +secondNumber + firstNumber;

        //prints out the decimal number
        System.out.println("The decimal number for " + userInput + " is " + decimalNumber);
        scan.close();




    }
}