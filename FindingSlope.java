//imports scanner class
import java.util.Scanner;                      


public class FindingSlope{
    //main method of program
    public static void main(String[]args){
//Creates scan variable of scanner object
Scanner scan = new Scanner(System.in);

System.out.println("Enter the x cordinate of the first point ");
//declares and initializes First x, second x, first y and second y variables to read the next input
double firstXCoordinate = scan.nextDouble();

System.out.println("Enter the y cordinate of the first point");
double firstYCoordinate = scan.nextDouble();

System.out.println("Enter the x cordinate of the 2nd point");
double secondXCoordinate = scan.nextDouble();

System.out.println("Enter the  y cordinate of the 2nd point");
double secondYCoordinate = scan.nextDouble();



//declaring and initializing variable, slope, its formula is used to find the slope of the line

double slope = (secondYCoordinate - firstYCoordinate) / (secondXCoordinate - firstXCoordinate);


//prints out the slope
System.out.println("The slope of the line that connects the two points(" + firstXCoordinate + "," + firstYCoordinate + ")(" + secondXCoordinate + "," +  secondYCoordinate + ") is "  + slope);





}

}
