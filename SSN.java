import java.util.Scanner;

public class SSN{
    public static void main(String [] args){
        System.out.println("Enter a SSN with the format DDDD-DD-DDD where D is digits, include slashes.");
        Scanner scan = new Scanner(System.in);
        String SSN = scan.nextLine();
        if(SSN.length() == 11){
            System.out.println("This is a valid social security number.");
        }
        else {System.out.println("This is an invalid social security number.");
        
    }}
}