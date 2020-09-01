//main header of the program
public class Test {
    //main method of the program
    public static void main(String[]args){

        //Creates 2 circle objects
        Circle1 circle1 = new Circle1(5); 
        Circle1 circle2 = new Circle1(4);
        // Display the max circle
    Circle1 circle = (Circle1)GeometricObject1.max(circle1, circle2); 

    System.out.println("The max circle's radius is " +
circle.getRadius()); 


 //this displays the bigger circle 
if((Circle1)GeometricObject1.max(circle1, circle2) == circle1){
    System.out.println("The bigger circle is circle 1");
}
    else{
        System.out.println("The bigger circle is circle 2");

    }

//Creates 2 rectanle objects and comapres them to see which is bigger
        Rectangle rectangle1 = new Rectangle(5, 3);
        Rectangle rectangle2 = new Rectangle (10,9);
    System.out.println(circle2.compareTo(circle1));

    Rectangle rectangle3 = (Rectangle)GeometricObject1.max(rectangle1, rectangle2);

    if((Rectangle)GeometricObject1.max(rectangle1, rectangle2) == rectangle1){
    System.out.println("The bigger Rectangle is Rectangle 1" );
    }
    else{
        System.out.println("The bigger Rectangle is Rectangle 2");
    }
        

    

    
} 

}
    

