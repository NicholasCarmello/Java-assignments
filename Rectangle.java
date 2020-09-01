//main header of program
public class Rectangle extends GeometricObject1{

    //double width and height
double width;
double height;

/**
 * this method gets the width and height, constructor
 */
    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;
    }

    /**
     * this method returns the area which is width times height
     */
    public double getArea(){
        return width * height;
    }
}