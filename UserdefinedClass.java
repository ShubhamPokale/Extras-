package Stackit;

public class    arr UserdefinedClass {

        private Student arr[];
        private int top ;
        private int size;

        public UserdefinedClass()
            {
                arr = new Student[15];
                top = -1 ;

            }

        public UserdefinedClass(int s)
            {
                arr = new Student[s];
                top = -1 ;

            }

        // push

        public void push(Student d)
            {
                if(isFull())
                    {
                        System.out.println("Stack Overflow ...");

                    }
                else
                    {
                        top = top +1;
                        arr[top] = d ;
                    }
            }
        //pop

        public Student pop()
        {Student d = null ;
            if(isEmpty())

                {
                    System.out.println("Stack Underlow ");
                    return d;
                }
            else
                {
                     d = arr[top];
                    top = top -1 ;
                    return d;
                }
        }
        //isEmpty
    public boolean isEmpty()
        {
            if(top == -1)
                {
                   // System.out.println("Stack Under flow ");
                    return true ;
                }
            else
                {
                    return false;
                }
        }
        //isFull
    public boolean isFull()
        {
            if(top == arr.length-1)
                {
                    return true;
                }
            else {return false;}
        }
        //size

    public int size()
        {   if(isEmpty())
            {return 0; }
            return top;
        }
}
