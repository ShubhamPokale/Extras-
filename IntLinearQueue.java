package QueueUsingArrays;

public class IntLinearQueue {

    private int[] arr;
    private int front, rear ;

    // non parametrized constructor
    public IntLinearQueue()
        {
            arr = new int[5];
            front = rear = -1;

        }

    public IntLinearQueue(int s)
        {
            arr = new int[s];
            front= rear = -1;
        }


    public boolean isEmpty()
        {
            if(front == -1 || (front -rear) ==1)
                {
                    return true;
                }
            else
            {
                return false;
            }

        }

    // enQueue // push

    public void enQueue(int d)
        {
            if(isFull())
                {
                    System.out.println("Overflow ...");
                }
//            if(front == -1)
//                {
//                    front =0;
//                }
            rear++;
            arr[rear] =d;
        }
    //pop(); // deQueue
    public int DeQueue()
        {   int d = -999;
            if(isEmpty())
                {
                    return d;
                }
            if(front - rear == 1 )
                {
                    front = -1 ;
                    return d;
                }

            d = arr[front];
            front++;
            return d ;
        }
    //isEmpty();
    //isFull();


    public boolean isFull()
        {
            if(rear == arr.length-1)
                {
                    return true;
                }
            else {return false; }
        }


    public void printQueue()
        {
            for(int i = front; i<=rear;i++)
                {
                    System.out.print(arr[i] + " ");

                }
            System.out.println(" ");
        }
}
