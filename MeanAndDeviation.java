import java.util.Scanner;

public class MeanAndDeviation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double mean;
        double max = 0;
    double userInput = 0;
    double number[] = new double[10];
    for (int i  = 0; i < 10; i++){
        number[i] = input.nextDouble();
        System.out.println("Enter a number");
        
    max = number[i] + max;

    }
    
    double results = 0;
    mean = max / 10;
    System.out.println("The mean is " + mean);
    
    double squared =0;
    double totalofsquared = 0;
    for (int i = 0; i < 10; i++){
       
    squared += Math.pow(number[i], 2);

    }

        System.out.println(results);
    }

    }
    
