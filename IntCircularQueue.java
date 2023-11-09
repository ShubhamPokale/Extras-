package QueueUsingArrays;

public class IntCircularQueue {

private int[] arr;
private int front, rear;

// non parameterized constructor
    public IntCircularQueue()
        {
            arr = new int[10];
            front = rear = -1 ;

        }

    public IntCircularQueue(int size )
        {
            arr = new int[size];
            front = rear = -1;
        }

    public boolean isFull()
        {
            if(((front == 0)&&(rear == arr.length))|| ( front -rear ==1))
                {
                    return true;
                }
            else
                return false;
        }

    public boolean isEmpty()
        {
            
        }

}
