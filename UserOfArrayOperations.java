package ArrayOperations;

import java.util.Scanner;

public class UserOfArrayOperations {


    public static void main(String[] args) {

        ArrayOperations arry1 = new ArrayOperations(5);

//
//
//
//
//
//        while(true){
//
//
//            System.out.println("Choose one from the following : ");
//            System.out.println("1. Read an Array into the RAM ");
//            System.out.println("2. Write the Array  ");
//            System.out.println("3. left shift  ");
//            System.out.println("4. right shift ");
//            System.out.println("5.Delete on position");
//            System.out.println("6. Insert on position");
//            System.out.println("7. Search an Element ");
//            System.out.println("8. left rotate");
//            System.out.println("9. right rotate");
//            System.out.println("10. Remove duplicate");
//
//
//
//            System.out.println("enter choice or press 0 to exit");
//
//
//
//
//            Scanner sc = new Scanner(System.in);
//            int ch=sc.nextInt();
//
//
//           if(ch==0){
//               System.out.println("So you chose 0, Exit initiated ! ");
//               break;
//           }
//           if(ch==1)
//            {   arry1.readArray();
//               System.out.println("you chose 1 ");
//            }
//           if(ch==2)
//            {   arry1.writeArray();
//               System.out.println("you chose 2 ");
//            }
//           if(ch==3)
//            {
//                arry1.leftShift();
//                System.out.println("Left shift done right ");
//                arry1.writeArray();
//            }
//
//           if(ch==4)
//           {
//               arry1.rightShift();
//               System.out.println("Right shift done right ");
//               arry1.writeArray();
//           }
//           if(ch == 5)
//           {
//               System.out.println("Delete Opereation : Enter the position");
//               int pos2 = sc.nextInt();
//               arry1.deleteByPosition(pos2);
//               arry1.writeArray();
//           }
//            if(ch == 6)
//            {
//                System.out.println("Insert operation : Enter the key to be inserted : ");
//                int key1 = sc.nextInt();
//                System.out.println("Enter the position you want it to be : ");
//                int pos1 = sc.nextInt();
//                arry1.insertByPostion(pos1,key1);
//                arry1.writeArray();
//            }
//            if(ch == 7)
//            {
//                System.out.println("Enter the element you want to search : ");
//
//            }
//            if(ch == 8)
//            {
//                System.out.println("left rotate : ");
//                arry1.leftRotate();
//                arry1.writeArray();
//            }
//            if(ch == 9)
//            {
//                System.out.println("right rotate : ");
//                arry1.rightShift();
//                arry1.writeArray();
//            }
//            if(ch == 10)
//            {
//                System.out.println("remove duplicate :");
//                arry1.removeDuplicatever01();
//                System.out.println("Duplicates removed I guess ! ");
//                arry1.writeArray();
//            }
//        }

           //   ArrayOperations arry1 = new ArrayOperations(5);

     //   arry1.removeDuplicatever02();
        arry1.readArray();
        arry1.removeDuplicatever02();
        arry1.writeArray();



    }




}
