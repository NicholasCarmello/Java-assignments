//Tester of the BillFold program
public class BillFoldTester extends Card{
    //Main method of the program
    public static void main(String []args){

    
        //These create a new idCard and Driverlicense under the card super
        Card numberOne = new IDCard("Handsome", "1992");
        
        Card numberTwo = new DriverLicence("Joe", "2001");

        //Creates new billFold
        BillFold newBill = new BillFold();

        // adds numberOne and NumberTwo to the newbill object
        newBill.addCard(numberOne);
        newBill.addCard(numberTwo);

        //Prints out the cards and their attributes
        System.out.println(newBill.formatCards());


        //This creates a new billfold called newBill2
        BillFold newBill2 = new BillFold();
        //This creates new calling card and driverlicense to see that it is expired as described in directions
        Card numberThree = new CallingCard("Hello", "Random", "Random");
        Card drivingCard = new DriverLicence("Janice", "2019");
        newBill2.addCard(numberThree);
        newBill2.addCard(drivingCard);
        System.out.println("expiredcount" + newBill2.getExpiredCount());
       
        
    }
}