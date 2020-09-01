// sub class of card
public class CallingCard extends Card{
    //creates cardNumber,pin attributes
    String cardNumber;
    String pIN;
/**
 * this method takes the name, cardnumber and pin of the argument 
 * @param yoak
 * @param cardNumber
 * @param pIN
 */
    public CallingCard(String yoak, String cardNumber,
    String pIN){

        super(yoak);
        this.cardNumber = cardNumber;
        this.pIN = pIN;

    }
    /**
     * this method returns the format of the super and the subclass attributes
     */
    public String format(){
        return super.format() + "the Card is " + cardNumber + " and the pin is " + pIN;
    }
    /**
     * this turns everything into a string and returnas it
     */
    public String toString(){
        return "Calling Card[name=" + getName() + "][number=" + cardNumber + ",pin =" + pIN;
    }
    /**
     * this method checks if all of the objects attributes are the same and then returns true if they are or false if theyre different
     */
    public boolean equals(Object obj){
        CallingCard callingCard = (CallingCard) obj;
        return (super.equals(callingCard) && this.cardNumber.equals(callingCard.cardNumber) &&
        (this.pIN.equals(callingCard.pIN)));
    }
}