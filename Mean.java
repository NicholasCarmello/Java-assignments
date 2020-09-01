//imports scanner class
import java.util.Scanner;

//main header of program
public class Mean{
    //main header of the program
    public static void main(String[] args){

        //creates new Scanner object
        Scanner input = new Scanner(System.in);

        //declare variables and initialize them for running total
double totalOfAllNumbers = 0;
double squared = 0;
double runningtotal=0;
double totalOfSquared = 0;
double num =0;

        //iterate 10 times
        for(int i =0; i < 10; i++){

            //gets users input and assigns it to num
            num = input.nextDouble();

            //this keeps a total of num
            totalOfAllNumbers += num;

            //runningtotal is assigned the number to the 2nd power
             runningtotal = Math.pow(num, 2);

             //this keeps running total of the squared
             totalOfSquared += runningtotal;
        
        }
        

        //this computes mean and prints it
        double mean = totalOfAllNumbers / 10;
        System.out.println("The mean is " +mean);

        //this is the formula for stanard deviation
 squared = Math.pow(totalOfAllNumbers, 2);
double dividedTotal = (squared / 10);
double standardDeviation = (totalOfSquared - dividedTotal) / 9;
double easy = Math.sqrt(standardDeviation);

//prints out the standard deviation
System.out.println("The standard deviation is " + easy);

//closes the scanner
input.close(); 
        
    }

}