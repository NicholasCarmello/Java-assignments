import java.util.Scanner;
public class Mean{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
double totalOfAllNumbers = 0;
double squared = 0;
double squaredEachNumber=0;
double runningtotal=0;
double totalOfSquared = 0;
        for(int i =0; 0 < 10; i++){
            num = input.nextDouble();
            totalOfAllNumbers += num;
            squaredEachNumber = num *num;
            totalOfSquared += squaredEachNumber;
            


        }
     double mean =  totalOfAllNumbers / 10;
        squared = Math.pow(totalOfAllNumbers, 2);
        double finesse = (squared / 10);
        System.out.println(finesse);
        double standardDeviation = (totalOfSquared - finesse) / 9;
        System.out.println(standardDeviation);
     
    }

}