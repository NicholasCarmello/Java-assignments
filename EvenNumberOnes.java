import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
//main header of program
public class EvenNumberOnes {
    //main method of the program
    public static void main(String[] args) throws IOException {

        //creates new matrix 6 x 6
        double[][] matrix = new double[6][6];

        //declares and initializes rows,columns ,i and j to 0
        double rows = 0;
        double columns = 0;
        int i = 0;
        int j = 0;

        //goes through all elements of a mtrix
        for (i = 0; i < matrix.length; i++) {
            for ( j = 0; j < matrix[i].length; j++) {

                //randomly generates 0s and 1s to matrix indexes
                double math = Math.random() * ((1 - 0) + 1) + 0;
                matrix[i][j] = (int) math;
            }
        }
        //prints out ' the matrix is: '
        System.out.println("The matrix is:");
        //goes through rows of matrix
        for (double []row : matrix){
            
            //prints out the rows
            System.out.println(Arrays.toString(row));
        }

        //nested for loops for going through 2d array
        for (i = 0; i < matrix.length; i++) {
            rows = 0;
            columns = 0;
            for (j = 0; j < matrix[i].length; j++) {

                if (j < 6) {
                    if (matrix[j][i] ==1){
                        columns +=1;
                    }
                    if (matrix[i][j] == 1) {
                        rows += 1;
                    }
                }
                
            }
            //if rows and columns are even then it prints out which rows and columns are even
            if (rows %2 == 0){
        System.out.println("The " + i  + " row is an even number of 1's ");
            }
            if (columns%2 ==0){
                System.out.println("The" + i + " column is an even number of 1's");
            }
        }
    }
}