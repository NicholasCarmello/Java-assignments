//imports Random class
import java.util.Random;

//Main header of program
public class LicensePlate{
    //Main method of program
    public static void main(String [] args){
        Random letter = new Random(); //creates new random object in memory

        //Creates 3 char variables, initiated to random integers 0-26, multipled by char to make it a letter.
        char firstRandomLetter = (char)(letter.nextInt(26) + 'A');
        char secondRandomLetter = (char)(letter.nextInt(26) + 'A');
        char thirdRandomLetter = (char)(letter.nextInt(26) + 'A');

        //creates 4 random ints. Ranges from 0 - 9
        int firstNumber = letter.nextInt(9);
        int secondNumber = letter.nextInt(9);
        int thirdNumber = letter.nextInt(9);
        int fourthNumber = letter.nextInt(9);
        
        //prints out the letters and numbers of the license plate
        System.out.print(firstRandomLetter);
        System.out.print(secondRandomLetter);
        System.out.print(thirdRandomLetter);
        System.out.print(firstNumber);
        System.out.print(secondNumber);
        System.out.print(thirdNumber);
        System.out.print(fourthNumber);



    }
}