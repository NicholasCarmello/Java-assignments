
//imports comparable class
import java.lang.Comparable;

//main header of prgoram
public abstract class GeometricObject1 implements Comparable<GeometricObject1>{

    //area field
double area;

/**
 * This method comapres the first object to the second 
 */
    public static GeometricObject1 max(GeometricObject1 firstGeo, GeometricObject1 secondGeo){
        return firstGeo.compareTo(secondGeo) == 1 ? firstGeo : secondGeo;
    }
    /**
     * this method checks to see which area is bigger of the two objects
     */
    public int compareTo(GeometricObject1 geoObject){
        if(this.getArea() > geoObject.getArea()){
            return 1;
        }
        else if (this.getArea() < geoObject.getArea()){
            return -1;
        }
        else {
            return 0;
        }
    }

   /**
    * this method calls the getArea method
    */
public abstract double getArea();


    

}
