package Stackit;

public class charStack {

    private char[] arr; // char array
    private int top;    // top
    private int size;   // size

    // Non parameterized constructor
    public charStack()
        {
            arr = new char[15];
            top = -1 ;

        }
    // Parameterized constructor
    public charStack(int s)
        {
            arr = new char[size];
            top = -1 ;

        }

    // push
    public void push(char d )
        {
            if(isFull())
                {
                    System.out.println("Stack Overflow :)");
                }
            else
                {
                    top = top +1  ;
                    arr[top] = d ;
                }
        }

    // pop
    public char pop()
        {   char d = '*';
            if(isEmpty())
                {
                    System.out.println("Stack Underflow :|");
                return d;
                }
            else
                {   top = top -1 ;
                    d = arr[top];
                    return d;

                }
        }


    // isFull
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
    // isEmpty

    public boolean isEmpty()
        {
            if(top == -1)
                {
                    return true;
                }
            else
            {
                return false;
            }
        }

    public char peek()
        {   char d = 'F';
            System.out.println("The top most element in the stack is : ");
            if(isEmpty())
                {

                    return d;
                }
            else
                {
                    System.out.println(arr[top]);
                    return arr[top];
                }


        }

    public int sizeOfStack()
        {

            return top+1;
        }

    public int return_top()
        {
            return top;
        }



}
