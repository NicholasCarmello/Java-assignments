//imports Scanner class
import java.util.Scanner;
//main header of the program
public class Matrix {
    //main method of the program
    public static void main(String[] args) {

        //Creates new scanner object named input
        Scanner input = new Scanner(System.in);

        //creates 2, 2 dimensional arrays
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        //Prompts the users to enter the numbers in each index of the array
        System.out.println("Enter the numbers in the rows and columns");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                //Prompts the user to enter a value at the desired index
                System.out.println("Enter the value of the first array at " + i + " " + j);

                //Gets each index in the first array
                a[i][j] = input.nextDouble();

                //Prompts the user to enter a value at the desired index
                System.out.println("Enter the value of the second array at " + i + " " + j);

                //Gets each index in the second array
                b[i][j] = input.nextDouble();
            }
        }

        
        

        //calls multiplyMatrix method
        double matrix[][] = multiplyMatrix(a, b);

        System.out.println("The matrixes are");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                System.out.println(matrix[i][j]);
            }
        }

        
    }

    //Creates new method called multiplyMatrix 
    public static double[][] multiplyMatrix(double a[][], double b[][]) {

        //Creates new 2 dimensional array named matrix of type double
        double[][] matrix = new double[3][3];

        //declared double named math
        double math;

        //goes through each element in the array
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {

                    //Equation for getting the matrix
                    math = (a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]);
                    matrix[i][j] = math;
                

            }

        }

        //returns matrix
        return matrix;
    }
}