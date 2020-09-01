//import scanner class
import java.util.Scanner;
//Main header of the program
public class TestQueues{
    //main method of the program
    public static void main(String[]args){
        //creates new queue object
        Queues newQueue = new Queues();
        //creates new scanner object
        Scanner scan = new Scanner(System.in);
       int dequeued = 0;
        
       //asks user to enter 20 numbers
        System.out.println("Enter 20 numbers in the queue");
        //goes through array length of 20 
        for(int i =0; i < 20; i++){
            newQueue.enqueue(scan.nextInt());
        
        }
        //goes through loop 20 times
        for(int i = 0; i < 20; i++){
            //calls the dequeue method in newQueue class
         dequeued = newQueue.dequeue();
         System.out.println("The number dequeued is " + dequeued);
         
        }
        //returns true if size is 0 or empty
        boolean bool = newQueue.empty();
        System.out.println(bool);
        
    }
}