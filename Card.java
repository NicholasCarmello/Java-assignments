//Super class
public class Card {
    //makes String name
private String name;
/**
 * Constructor
 */
public Card() { 
    name = "";
}
/**
 * constructor 
 * @param n
 */
public Card(String n) {
    name = n;
}
/**
 * constructor to get the name and return it
 */
public String getName() { 
    return name;
}
//this always returns false handy for the driverlicense and phone card
public boolean isExpired() { 
    return false;
}
/**
 * this formaths the card holder and returns it
 * @return
 */
public String format() {
return "Card holder: " + name;
}
public String toString(){
return "Card[name=" + this.name + "]";
}
public boolean equals(Object obj){
    Card card = (Card) obj;
    return(this.name.equals(card.name));
}
}