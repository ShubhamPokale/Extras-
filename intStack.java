package Stackit;

public class intStack {     // Stack Implementation using array

    private int[] arr;          // Private
    private int size;
    private int top;

    // Non-Paraemeterized constructor
    intStack()
        {
            arr = new int[15];
            top =-1;
        }
        //Parameterized Constructor
    intStack(int size)
        {
            this.size = size;
            arr= new int[size];

        }
        // push
    public void push(int d)
    {
        if(isFull())
            {
                System.out.println("Stack Overflow ...");
            }

        top++;
        arr[top] = d;

    }

    public boolean isFull()
        {
            if(top == arr.length -1)
                {
                    return true;
                }
            else
                {
                    return false;
                }
        }

    public boolean isEmpty()
        {
            if(top ==-1)
                {
                    return true;

                }
            else
                {
                    return false;
                }
        }

    public int  pop()
        {   int d;
            if(isEmpty())
                {   d = -404;
                    System.out.println("Stack Underflow ...");
                }
            else
            {
                 d = arr[top];
                top = top -1;


            }

            return d;
        }


    public int peek()
        {   int d;
            if(isEmpty())
                {   d = -404;
                    System.out.println("Stack is empty");
                }
            else
            {
                d = arr[top];
            }
            return d;
        }


    public int sizeOfStack()
        { System.out.println(top+1);
            return top +1;

        }


    public int return_top()
        {
            return top;
        }
}
