//imports scanner class
import java.util.Scanner;

//main header of the program
public class PointInCircle{
    //main method of the program
    public static void main(String [] args){
        //creates new scanner object
        Scanner scan = new Scanner(System.in);
        //prints out enter x coordinate
        System.out.println("Enter the x coordinate");
        //gets users input
        double userXPoint = scan.nextDouble();
        //prints out enter y coordinate
        System.out.println("Enter the y coordinate");
        //gets users input
        double userYPoint = scan.nextDouble();

        //distance formula for a circle
        double distance = Math.sqrt((Math.pow(userXPoint - 0,2)) + (Math.pow(userYPoint - 0, 2)));

        //prints out a statement if its less than or equal to 10 and another statement if its more than 10
        if(distance <= 10){
            System.out.println("its in the circle");}
            else {
                System.out.println("its not in the circle");
            }

            scan.close();
        }
    
}