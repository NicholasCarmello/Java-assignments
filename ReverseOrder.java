//imports scanner class
import java.util.Scanner;

//main header of program
public class ReverseOrder{
    //main method of program
    public static void main(String [] args){

 Scanner scan = new Scanner(System.in);

 //gets the users input number
 String userInput = scan.nextLine();
 
 //declaring num variable
char num;

//for loop goes through all numbers of userinput
for(int i =1; i < userInput.length() + 1; i++){

    //goes through all of the numbers of the userInput 
    num = userInput.charAt(userInput.length()- i);

    //prints out the num
    System.out.print(num);
    
                            }

}
}