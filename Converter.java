//imports scanner class
import java.util.Scanner;


//main header of program
public class Converter{
    //main method of program
    public static void main(String[]args){
        //creates scanner object
        Scanner input = new Scanner(System.in);

        //Asks the user how many milliseconds
        System.out.print("Enter how many milliseconds you want converted");

        //gets user input
        long millis = input.nextLong();

        //calls the convertmillis method
        String conversion = convertMillis(millis);

        //prints out man
        System.out.println(conversion);
        input.close();

    }
    //new method called convertMillis
    public static String convertMillis(long millis){

        //formulas for converting milliseconds to hours,seconds and mionutes
        long  hours = (((millis / 60)  / 60) /  1000 );
        long remainderofHours = (millis % (60 * 60* 1000));
        long minutes = ((remainderofHours / 60 / 1000));
        long remainderofminutes = (remainderofHours % (60 * 1000));
        long seconds = ((remainderofminutes / 1000));
        
        //converts longs to strings
        String hoursToString = Long.toString(hours);
        String minutesToString = Long.toString(minutes);
        String secondsToString = Long.toString(seconds);
        String concat = (hoursToString + ":" + minutesToString +":" + secondsToString);
        return concat;
        

       }
}