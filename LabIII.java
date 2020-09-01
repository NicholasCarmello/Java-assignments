import java.util.Scanner;

public class LabIII{
    public static void main( String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Enter the number of temrs to calculate to estimate e:");
        int maxI =  input.nextInt();

        // Define a variable to estimare e as a running sum
        double estimateE = 0;


        
        
        
        //Loop N times and calculate terms like 1/i!
        for(int i = 0; i <= maxI; i++){

            //Calculate i! i = i *(i-1) i-2 * 1
            //TODO
            double iFactorial = 1;
            //Calculate i! = 1 * 2 * ... * 1
            for(int j = 1; j <= i; j++){
                iFactorial  = iFactorial * j;
            }


            estimateE = 1 / iFactorial + estimateE;
        }
            //Calculate i!
        //Add each term to the a running sum
        double actualE = Math.E;
     System.out.println("Given " + maxI + " terms e is estimated to be " + estimateE);
     System.out.println("The real value of E is " + actualE);

     double eroorPercentage = 100 * Math.abs(actualE - estimateE) / actualE;
     System.out.println("error is " + eroorPercentage);
     input.close();
    }
}