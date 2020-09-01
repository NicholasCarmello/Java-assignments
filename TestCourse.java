//imports the scanner class
import java.util.Scanner;

//Main header of the program

public class TestCourse {
    //main method of the program
    public static void main(String[] args) {

        //Asks the person to enter a course name
        System.out.println("Enter a course name");
        //This creates a scanner object from scanner class
        Scanner scan = new Scanner(System.in);
        //This scans the next word for the course
        String Course = scan.next();
        Course course1 = new Course(Course);

        //Tells the user to add students
        System.out.println("Add the new students");
        
        //gets the 3 students names
        course1.addStudent(scan.next());
        course1.addStudent(scan.next());
        course1.addStudent(scan.next());

        //asks the user which student is dropping the course

        System.out.println("Which student is dropping it?");
        //gets the array from the get students method

        String[] newArray = course1.getStudents();
        //drops the student from the new array
        course1.dropStudent(scan.next(), newArray);

        //Makes a new array with the updated version
        String[] newerArray = course1.getStudents();

        //prints out the students in the class and tells who dropped it
        for (int j = 0; j < newerArray.length; j++) {
            System.out.println(newArray[j]);
        }
        //closes the scanner object
        scan.close();
    }
}