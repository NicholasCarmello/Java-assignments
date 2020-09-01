
public class BillFold extends Card{

    //sets card 1 and 2 to null at the start
    Card numberOne = null;
    Card numberTwo = null;
    int count = 0;

    //this program formats the cards with the Card format methods
    public String formatCards(){
        return "[" + numberOne.format() + "|" + numberTwo.format() + "]";
    }
    //This program adds the cards if they arent already there
    public void addCard(Card replacementCard){

        if (numberOne == null){
            numberOne = replacementCard;
        }
        else if (numberTwo == null){
            numberTwo = replacementCard;
        }
    }
     /**
      * this program keeps a running track of the count of expired cards
      * @return
      */
    public int getExpiredCount(){
        
        if(numberOne.isExpired()) {
            count +=1;
        }
        if(numberTwo.isExpired()){
            count+=1;
        }
        return count;
    }
}