//imports scanner class
import java.util.Scanner;                      


public class Assignment1{
    //main method of program
    public static void main(String[]args){
//Creates scan variable of scanner object
Scanner scan = new Scanner(System.in);

System.out.println("Enter the first x cordinate");
//declares and initializes First x, second x, first y and second y variables to read the next input
double firstXCoordinate = scan.nextDouble();

System.out.println("Enter the second x cordinate");
double secondXCoordinate = scan.nextDouble();

System.out.println("Enter the first y cordinate");
double firstYCoordinate = scan.nextDouble();

System.out.println("Enter the second y cordinate");
double secondYCoordinate = scan.nextDouble();



//declaring and initializing variable, slope, its formula is used to find the slope of the line

double slope = (secondYCoordinate - firstYCoordinate) / (secondXCoordinate - firstXCoordinate);


//prints out the slope
System.out.println(slope);





}

}
