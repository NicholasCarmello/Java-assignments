//subclass of Card
public class IDCard extends Card{
    // new idnumber
    String iDNumber;
    /**
     * 
     * @param name
     * @param iDNumber
     */
    public IDCard(String name, String iDNumber){
        super(name);
        this.iDNumber = iDNumber;
    }
    /**
     * This method formats it into a string by calling the super format and then overriding
     */
    public String format(){
        
        return super.format() +" Cards id number is " +  iDNumber;
    }
    /**
     * this method turns it into a string and prints it
     */
    public String toString(){
        return "IDCard[name=" + this.getName() +"][idNumber=]" + this.iDNumber + "]";
    }
    /**
     * this method comapres the object to make sure they have the same attributes
     */
    public boolean equals(Object obj){
        IDCard idCard = (IDCard) obj;
        return (super.equals(idCard) && this.iDNumber.equals(idCard.iDNumber));
    }
    
}