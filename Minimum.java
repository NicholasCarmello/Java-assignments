
//imports the Scanner class
import java.util.Scanner;
//main header of the program
public class Minimum{

    //main method of the program
    public static void main(String [] args){

    
        //creates new scanner object called input
        Scanner input = new Scanner(System.in);

        //prompts user to enter the length of the array
        System.out.println("Enter the length of the array");

        //takes user input
      int arrayLength = input.nextInt();

        //Creates an int array of length of the users input
      int []array = new int[arrayLength];

      //prompts the user to enter the numbers in each index
        System.out.println("Enter all of the numbers in the array");

        //goes through all indexes of the array
      for (int i= 0; i < array.length ; i++){

        //Takes the input for all the indexes
          array[i] = input.nextInt();
      }

      //initializes and declares index to findLocalMinimum method
     int index =  findLocalMinimum(array);

     //prints out the index of the local minimum and the number it is
     System.out.println("The index of the local minmimum is " + index);
      System.out.println("The number in this array is " + array[index]);
     
    }


    //Creates new method called findLocalMinmum
    public static int findLocalMinimum(int[] array){

        //Initializes index declares it to 0
        int index = 0;

        //goes through index of [1] to the index of the length of the array
        for (int i = 1; i < array.length; i++){

            //If the indexed number is less than the previous indexed number and the less than the next indexed number
            if (array[i] < array[i - 1] && array[i] < array[i + 1]){

                //index = local minimum
                index = i;
                //breaks out of the loop
                break;
            }
        }
        //returns the index
        return index;
    }
}