package Stackit;

public class doubleEndedStack {
private int[] arr;
private int topA, topB;

// Non-parameterized constructor
public doubleEndedStack()
    {
        arr = new int[5];
        topA = -1 ;
        topB = arr.length;

    }

    // Parameterized constructor

    public doubleEndedStack(int size)
        {
            arr = new int[size];
            topA = -1;
            topB = arr.length;
        }

    //pushA

    public void pushA(int d)
        {
            if(isFull())
                {
                    System.out.println("Stack Overflow");
                }
            else
                {
                    topA ++ ;
                    arr[topA] = d;

                }
        }
    //pushB

    public void pushB(int d)
        {
            if(isFull())
                {
                    System.out.println("Stack Overflow");
                }
            else
                {
                    topB--;
                    arr[topB] = d;
                }
        }

    //popA
    //popB
    // isEmptyA isEmptyB
    public boolean isEmptyA()
        {
            if(topA == -1)
                {
                    return true;
                }
            else
            {return false;}
        }

    public boolean isEmptyB()
        {
            if(topB == arr.length)
                {
                    return true;
                }
            else{return false;}
        }


    //isFull

    public boolean isFull()
        {       // topA index goes beyond topB and thats when I know my array is full
            if((topA - topB) == 1)
                {
                    return true;
                }
            else
                return false;
        }


}
