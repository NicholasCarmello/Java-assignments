//main header of the program
public class Queues{
    //creates new integer array of size 8
      int[] integers = new int[8];
      //running count of the size
    int size =0;

    /**
     * This is default contructor of the program
     */
    public Queues(){
        //Creates new array of integer when program is called
        int[] integers = new int [8];
        }
        /**
         * this method adds values to the array when called
         */
    public void enqueue(int v){
        //these assign arguments to the array as size goes up
        integers[size] = v;
        size++;
        //if the array is as running size creates new array with doubled size
        if (integers.length == size){
             int[] newArray = new int[size * 2];
            for(int i =0; i < integers.length; i++){
                newArray[i] = integers[i];
            }
            integers = new int[size * 2];
            for(int i =0; i < integers.length; i++){
               integers[i] = newArray[i];
            }
        
        }
        
        }
        /**
         * this method takes out the first value of the array and returns it
         */
    public int dequeue(){
        int firstValue = integers[0];
        //goes through every value except for 0 in the array
        for(int i =1; i <integers.length;i++){
            integers[i - 1] = integers[i];
        }
        size--;
        return firstValue;
    }
    /**
     * This method returns false if there are integers in the array
     */
    public boolean empty(){
      return size ==0;
        }
    
    
    /**
     * this method returns the size of the array
     * @return
     */
    public int size(){
        return integers.length;
    }
}