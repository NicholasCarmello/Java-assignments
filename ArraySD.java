//imports Scanner class
import java.util.Scanner; 

//Header of the program
public class ArraySD{
    
    //main method of program
    public static void main(String [] args){

        //Create new Scanner object
        Scanner input = new Scanner(System.in);

        // declares an array of 10 indexes
        double[] values = new double[10];
        double array;

        //loop through the array
        for (int i = 0; i < values.length; i++){

                //takes input and then assigns to indexes in the array
                array  = input.nextDouble();
                values[i] = array;
        }
        //assigns mean to the mean methods return value
        double mean = mean(values);

        //assigns standarddeviation to the standard deviation methods return value
        double standardDeviation = standardDeviation(values, mean);

        //prints out mean and stanard Deviation
        System.out.println( "The mean is " + mean);
        System.out.println( "The standard deviation is " + standardDeviation);
        
        
    }

    //New method called mean with x parameter
    public static double mean(double[] x){

        //Declares and intializes mean and total to 0;
        double mean = 0;
        double total = 0;

        //Takes the total of all the numbers in every index
        for(int i = 0; i < x.length; i++){
            total += x[i];
        }
        //Divides total by 10
        mean = total / 10;

        //returns mean
        return mean;

    }
    //new Method called standard deviation with x[] and mean parameters
    public static double standardDeviation(double[] x, double mean){
        
        //Goes through all the numbers of the array, doubles them, and assigns them into the index
        for ( int i =0; i < x.length; i++){
            double addedNumbers = Math.pow(x[i] - mean, 2);

            x[i] = addedNumbers;
        }

        //Declares y variable and initializes it to 0
        double total =  0;

        //goes through all the numbers and adds them to a total
        for(int j =0; j < x.length; j++){
            total += x[j];
        }

        //Divides the total then gets the squareRoot
        double squareRoot = total / 9  ;
        double SD = Math.sqrt(squareRoot);
        
        //Returns the standard deviation
        return  SD;

    }
}