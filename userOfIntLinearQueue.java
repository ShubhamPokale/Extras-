package QueueUsingArrays;

public class userOfIntLinearQueue {

    public static void main(String[] args) {
        IntLinearQueue LinearQueue1 = new IntLinearQueue();

        System.out.println(  LinearQueue1.isEmpty());
        LinearQueue1.enQueue(10);
        LinearQueue1.enQueue(10);

        System.out.println( LinearQueue1.isFull());
        LinearQueue1.DeQueue();
        LinearQueue1.DeQueue();
        System.out.println(LinearQueue1.isEmpty());
       // LinearQueue1.pop();
    }


}
