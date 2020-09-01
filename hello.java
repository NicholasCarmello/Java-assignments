import java.util.Scanner;
//main header of the program
public class SieveOfEratosthenes{
    //main method of the program
    public static void main(String[] args){
    
        
        //initializes n to 50 
        int n = 50;

        //creates boolean array to n + 1 while n = 50
        boolean[] array = new boolean[n +1];
        
        
        // for loop for going through an array
       for(int i = 0; i < n; i++){
           

        //turns everything in the array to true
        array[i] = true; 

        //goes through all the non prime numbers
        for(int j =2; j*j <= n; j++){

            //if they are true, if they are prime this means, they will go through the next for loop section
            if(array[j] == true){

                //this loop goes through and turns all non prime numbers to false 
                for (int k= j * 2; k <= n; k+= j ){
                    array[k] = false;
                }
            }
            }
           
       }
       
       
       for(int k=0; k<n; k++){
        if(array[k] == true){
            System.out.println(k);
        }
       }
       




    }
}