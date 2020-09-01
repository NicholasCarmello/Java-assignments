public class Queue{
    int[] integers = new int[8];
    int size =0;
    public Queue(){
        int[] integers = new int [8];
        }
    public void enqueue(int v){
        integers[size] = v;
        size++;
        }
    public int dequeue(){
        int firstValue = integers[0];
        for(int i =1; i <integers.length;i++){
            integers[i - 1] = integers[i];
        }

        return firstValue;
    }
    public boolean empty(){
        for(int i =0; i < integers.length; i++){
            if (integers[i] < 0 || integers[i] > 0){
                return false;
            }
        }
        return true;
    }
    public int size(){
        return integers.length;
    }
}