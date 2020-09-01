import java.util.Scanner;
public class TestQueue{
    public static void main(String[]args){
        Queue newQueue = new Queue();
        Scanner scan = new Scanner(System.in);
       newQueue.Queue();
        newQueue.size();
        System.out.println("Enter 20 numbers in the queue");
        for(int i =0; i < newQueue.integers.length; i++){
            newQueue.enqueue(scan.nextInt());
        
        }
        for(int i = 0; i < newQueue.integers.length; i++)
        newQueue.dequeue();
    }
}