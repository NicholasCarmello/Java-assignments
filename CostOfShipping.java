//imports the scanner cladss
import java.util.Scanner;

//main header of the program
public class CostOfShipping{
    //main method of the program
    public static void main(String[] args){

        //creates new scanner object
        Scanner scan = new Scanner(System.in);

        //declares and initializing weight
        double weight = scan.nextDouble();

        //checks if the weight is at a specific amount to see how much it will be and prints out cost
        if (weight > 20){
            System.out.println("The package can't be shipped because it weighs too much.");
        }
        else if(weight <= 20 && weight > 10){
            System.out.println("The cost of shipping is 10.50$");
        }
        else if(weight <= 10 && weight > 4){
            System.out.println("the cost of shipping is 7.50$");
        }
        else if (weight <= 4 && weight > 2){
            System.out.println("The cost of shipping is 4.50$");
        }
        else {System.out.println("the cost of shipping is 2.50$");
          
        }
        scan.close();
    }
}