//imports scanner class
import java.util.Scanner;

//main header of the program
public class DayOfTheWeek{

    //main method of the program
    public static void main(String[] args){

        //Prints out Enter the date: 
        System.out.println("Enter the date: example: Febuary 2, 2002");

        //creates new scanner object
        Scanner scan = new Scanner(System.in);

        //Takes the month as a string
        String monthsAsWords =  scan.next();

        //gets the day (number)of the month
        String d = scan.next();

        //gets the year number
        int year = scan.nextInt();

        //closed the scanner
        scan.close();

        //Declares split variable
        String[] split;

        //takes the comma apart from the day so I can get the number notation and convert it to an int
        split = d.split(",");

        //takes the 0 character in the split array and turns it into an int.
        int days = Integer.parseInt(split[0]);

        int m = 0;

        //if statements to Figure out what the user inputed as the month and assigns it to its number value of the month. January would be equal to 1.
        if (monthsAsWords.equalsIgnoreCase("January")){
            m = 1;
        }
        else if (monthsAsWords.equalsIgnoreCase("February")){
            m = 2;
        }
        else if (monthsAsWords.equalsIgnoreCase("march")){
            m = 3;
        }
        else if (monthsAsWords.equalsIgnoreCase("april")){
            m = 4;
        }
        else if (monthsAsWords.equalsIgnoreCase("may")){
            m = 5;
        }
        else if (monthsAsWords.equalsIgnoreCase("june")){
            m = 6;
        }
        else if (monthsAsWords.equalsIgnoreCase("july")){
            m = 7;
        }
        else if (monthsAsWords.equalsIgnoreCase("august")){
            m = 8;
        }
        else if (monthsAsWords.equalsIgnoreCase("september")){
            m = 9;
        }
        else if (monthsAsWords.equalsIgnoreCase("october")){
            m = 10;
        }
        else if (monthsAsWords.equalsIgnoreCase("november")){
            m = 11;
        }
        else if (monthsAsWords.equalsIgnoreCase("december")){
            m = 12;
        }
        else {

            //prints out "Inalid month try the program again"
            System.out.println("Invalid month try the program again");
        }
       
        //formula for figuring out the number assosicated for the day of the week. used year, m , and days variable
        int y = year - ((14 - m) / 12);
        int x = y + (y / 4) - (y/100) + (y / 400);
        m = (m + (12 * ((14 - m) / 12))) - 2;
        days = (days + x + ((31 * m ) / 12)) % 7;

        //Declares and initializes day to 'Random' just to initialize it
        String day = "random";

        //if statements to figure out the day of the week, I compared days to a number and the number correlates to a day of the week
        if(days == 1){
            day = "monday";
        }
        if(days == 2){
            day = "tuesday";
        }
        if(days == 3){
            day = "wednesday";
        }
        if(days == 4){
            day = "thursday";
        }
        if(days == 5){
            day = "friday";
        }
        if(days == 6){
            day = "saturday";
        }
        if(days== 0){
            day = "sunday";
        }
        
        //prints out the day of the week
        System.out.println(day);

    }
}