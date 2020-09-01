//Main header of program
public class Course {
    //Declares courseName
    private String courseName;

    //Declares Student array of 100
    private String[] students = new String[100];

    //Declares numberOfStudents int
    private int numberOfStudents;
/**
 * 
 * @param courseName
 */
    public Course(String courseName) {
        this.courseName = courseName;
    }
/**
 * //This method adds students to the Array and makes a new array if the student capacity reaches 100
 * @param student
 */
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
        if (numberOfStudents == 100){
           String[] newStudentsArray = new String [200];
           for(int i =0; i < students.length; i ++){
               newStudentsArray[i] = students[i];
        }
        }
        //calls get student method
        getStudents();
    }
/**
 * this method gets The students into a new array and returns the new array
 * @return
 */
    public String[] getStudents() {
        int studentCount = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                studentCount++;
            }
        }
        String[] newArray = new String[studentCount];
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                newArray[i] = students[i];
            }
        }
        return newArray;
    }
/**
 * 
 * @return
 */
//this method returns the number of students in the classroom
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
/**
 * 
 * @return
 */
    public String getCourseName() {
        return courseName;
    }
/**
 * this method drops a student in the class and decrements the number of students by 1
 * @param student
 * @param newArray
 */
    public void dropStudent(String student, String[]newArray) {
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i].equalsIgnoreCase(student)) {
                newArray[i] = null;
                
            }
        }
        numberOfStudents--;
    }
/**
 * this method clears the entire student body in the course
 * @param array
 */
    public void clear(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }

    }
}
