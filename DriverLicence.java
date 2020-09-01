import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;



//sub class of the card
public class DriverLicence extends Card {

    //expirationyear attributre
String expirationYear;

/**
 * this takes the name and puts it in super constructor and then gets the expiration year and puts it in this expirationyear
 * @param yoak
 * @param expirationYear
 */
public DriverLicence(String yoak, String expirationYear){
    super(yoak);
    this.expirationYear = expirationYear;
}
/**
 * this method calls super format method and add the next line to it
 */
public String format(){
    return super.format() + " this expires on: " + expirationYear;
}
/**
 * this method should convert this to a string
 */
public String toString(){
    return "DriverLicense[Name=" + getName() +"]number= ";
}
/**
 * this method checks to see if the card is expired by comparing it to current year
 */
public boolean isExpired(){
    java.util.GregorianCalendar calender = new java.util.GregorianCalendar();
    int year = calender.get(Calendar.YEAR);
   
    if(Integer.valueOf(expirationYear) >  year){
        return true;
    }
    else {return false;}
}
 /**
  * this method sees if driverlicense and its attributes are equal to the expiration year and new license
  */
public boolean equals(Object obj){
DriverLicence newLicense = (DriverLicence) obj;
return (super.equals(newLicense) && this.expirationYear == newLicense.expirationYear);
}





}