             
//Main header of the program
public class MonteCarlo{
    
    //main method of the program
    public static void main(String [] args){


        //Initializing these variables
        double x;
        double addedNumbers;
        double y; 
        double xDoubled;
        double squareRoot;
        double yDoubled;
        double numberOfHits = 0;
        for(int i = 0; i < 1000000; i++){
            //Takes 2 random numbers between values of -.99 and .99.
            x = (Math.random() * (1  - (-1))) + (-1);
            y = (Math.random() * (1  - (-1))) + (-1);

            //Raises these random numbers to 2nd exponent
            xDoubled = Math.pow(x, 2);
            yDoubled = Math.pow(y, 2);

            //Adds the random numbers that were doubled together
            addedNumbers = xDoubled + yDoubled;

            //Takes the square root of the total.
            squareRoot = Math.sqrt(addedNumbers);
            

            //if squareRoot is less than 1.
            if (squareRoot < 1){

                //Running value of numberOfHits keeps adding 1
                numberOfHits += 1;
            }
        

        }

        //intializes and declares pi to the numberofHits variable multipled by 4 and divided by 1 million
        double pi = 4 * numberOfHits /1000000;

        //This prints out the estimate for pi
        System.out.println(pi);
    }
}