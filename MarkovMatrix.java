
//imports Scanner class
import java.util.Scanner;

//main header of program
public class MarkovMatrix {
    //main method of the program
    public static void main(String[] args) {

        //creating new 3x3 matrix
        double[][] matrix = new double[3][3];

        //asks the user to enter all the numbers in the matrix
        System.out.println("Enter all of the fields in your 3x3 matrix");

        //creates new object
        Scanner scan = new Scanner(System.in);

        //declares userInput
        double userInput;

        //declares column and initializes column
        double column = 0;

        //for loop for going through 2d array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //gets all the users input
                matrix[i][j] = scan.nextDouble();
            }
        }

        //declares isMarkovMatrix and initializes it to method
        boolean isMarkovMatrix = isMarkovMatrix(matrix);
        if (isMarkovMatrix == true) {

            //prints out its a matrix if it is
            System.out.println("It's a Markov Matrix.");
        } else {

            //prints out not a matrix if its not
            System.out.println("It's not a Markov Matrix.");

            //closes the scanner
            scan.close();
        }
    }

    //creates new method named isMarkovMatrix
    public static boolean isMarkovMatrix(double[][] m) {

        //declares markov to true
        boolean markov = true;
        double column = 0;

        //goes through all the elements in the 2d array
            for (int i = 0; i < m.length; i++) {
                column = 0;
                for (int j = 0; j < m[i].length; j++) {

                    //if number is a negative markov is false
                    if (m[j][i] < 0) {

                        markov = false;
                    }
                    column += m[j][i];
                }
                //if columns dont add up to one its false
                if (column != 1){
                    markov = false;
                }
                

            }
        
        return markov;
    }
    
}