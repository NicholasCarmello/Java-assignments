//imports scanner class
import java.util.Scanner;

//main header of program
public class Recursion{
    //main method of the program
    public static void main(String[]args){
        

        //this creates a new scanner
        Scanner scan = new Scanner(System.in);


        //asks user to enter a number and passes that number into the method for recursion
        System.out.println("Enter a number for recursion");
        int n = scan.nextInt();


        int m = n;
        int count = 0;
        

        count += sum(m);
       
        System.out.println(count);


        
    }
    //method that calls itself untill it gets down to less than 1 or 1
    public static double sum(int n){

      if (n <=1){
          return 1;
      }
      else return n + sum(n-1);
    }
}