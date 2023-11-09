package Stackit;

public class UserOfUserDefinedStack {


   public static void main(String[] args) {
        UserdefinedClass stack1 = new UserdefinedClass();
        Student s1 = new Student("Steve Jobs",100);
        Student s2 = new Student("Steve Wozniak" ,101);
        Student s3 = new Student("Bill Gates" ,102);
        System.out.println(stack1.isEmpty());
        stack1.push(s1);
        stack1.push(s2);
        stack1.push(s3);
        System.out.println(stack1.size());
        stack1.pop();
        System.out.println(stack1.size());
        stack1.pop();
        System.out.println(stack1.size());
        stack1.pop();
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.size());

//        doubleEndedStack stackA = new doubleEndedStack();
//       System.out.println(stackA.isEmptyA());
//       stackA.pushA(10);
//       System.out.println(stackA.isEmptyA());
//
//       System.out.println(stackA.isEmptyA());
//
//       System.out.println( stackA.isEmptyB());
//       System.out.println(stackA.isFull());
//
//
    }
}
