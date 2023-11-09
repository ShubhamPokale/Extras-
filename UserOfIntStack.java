package Stackit;

import java.util.Scanner;

public class UserOfIntStack {

    public static void main(String[] args) {


        Student s1 = new Student();
        Student s2 = new Student("John",20);
        UserdefinedClass stack1 = new UserdefinedClass();
        System.out.println(stack1.isEmpty());
        stack1.push(s1);
        stack1.push(s2);
        System.out.println(stack1.size());

        //intStack stack1 = new intStack();
//        charStack stack1 = new charStack();
//        System.out.println("Is the stack empty ?");
        //System.out.println(stack1.isEmpty());
//        stack1.push(10);
//        stack1.push(20);
//        stack1.push(30);
//        stack1.push(40);
//        stack1.sizeOfStack();
//        stack1.pop();
//        stack1.pop();
//        stack1.pop();
//        stack1.pop();
//        stack1.pop();
//        stack1.pop();

//        stack1.sizeOfStack();
//        System.out.println(stack1.isEmpty());
//        System.out.println(stack1.return_top());
//
//        while(true)
//        {
//            System.out.println(" Choose one from the following : ");
//            System.out.println("1.Push an element ");
//            System.out.println("2.Pop an element");
//            System.out.println("3. Size of stack");
//            System.out.println("4. Peek ");
//            System.out.println("5.Cntrl + Z");
//
//
//
//
//
//
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a choice or enter 0 to exit" );
//            int ch = sc.nextInt();
//            if(ch == 0)
//                {
//                    System.out.println("Bye bye ");
//                    break;
//                }
//            if(ch == 1)
//                {
//                    System.out.println("Enter the element you want to push :");
//                    char d =sc.next().charAt(0);
//                    stack1.push(d);
//                }
//            if(ch == 2)
//            {
//                System.out.println("Poping an element from the stack : ");
//                stack1.pop();
//            }
//            if(ch == 3)
//            {
//                    System.out.println("The size of Stack is : " + stack1.sizeOfStack());
//
//            }
//            if(ch == 4)
//            {
//                System.out.println("Peek " + stack1.peek());
//
//            }






        }
    }
//}
