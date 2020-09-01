//imports scanner class
import java.util.Scanner;

//imports files
import java.io.*;

//main header of the program
public class Thou{
    //main method of the program
    public static void main(String [] args)throws IOException{
        
        //takes argument and makes it into file
        InputStream input = new FileInputStream(args[0]);

        //scans the file and reads it
        Scanner scan = new Scanner(input);

        
        int count =0;

        //goes through the file and counts the files
        while(scan.hasNext()){
        
            
            if(scan.next().equalsIgnoreCase("thou")){
                count+=1;
            }
        }

        //prints out the count of thous
        System.out.println(count);
        
       
        
    }
}