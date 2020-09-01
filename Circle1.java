//subclass of Geometricobject
public class Circle1 extends GeometricObject1 {

    //radius field
    double radius;

    /**
     * this method takes the argument radius and puts it into this radius
     */
    public Circle1(double radius){
        this.radius = radius;

    }

    /*
    *this method returns the area
     */
    public double getArea(){
        return radius * radius * 3.14;
    }
    /**
     * this method returns the radius
     */
    public double getRadius(){
        return radius;
    }


}