package ArrayOperations;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayOperations {
    private int arr[];

    public ArrayOperations()
        {
            arr = new int[5];

        }

        //Parameterized constructor
    public ArrayOperations(int s)
        {
            arr = new int[s];
        }
    // Class methods

    public void readArray()
        {
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<arr.length;i++)
                {
                    arr[i] = sc.nextInt();

                }
            return;
        }


    public void writeArray()
        {
            for(int i=0; i<arr.length;i++)
                {

                    System.out.print(arr[i] + " ");
                }
            System.out.println(" ");
            return;
        }

    public void leftShift()
        {
           for(int i=0; i<arr.length-1;i++)
            {
                arr[i] = arr[i+1]; // left shift

            }
        return;
        }

    public void rightShift()
        {

            for(int i = arr.length-1;i>0;i--)
                {
                    arr[i] = arr[i-1]; //right shift
                }
            return;
        }


    public void leftRotate()
            {
                int temp = arr[0];

                for(int i=0; i < arr.length-1;i++)
                    {
                        arr[i]= arr[i+1];
                    }
                arr[arr.length-1] = temp;
                return;
            }


    public void rightRotate()
            {
                int temp = arr[arr.length -1];

                for(int i = arr.length -1;i>0;i--)
                    {
                        arr[i] = arr[i-1]; // right shift
                    }
                arr[0] = temp;
                return;
            }


    public void insertByPostion(int pos,int key)
            {   int i;
                for(i=arr.length-1;i>pos-1;i--)
                    {
                        arr[i] = arr[i-1];

                    }
                arr[i] = key;
                System.out.println("Element " + key + " inserted at "+ pos + "Succesfully ");
            }

    public void deleteByPosition(int position)
            {
                int i;
                int data = arr[position-1];
                for(i = position-1;i<arr.length-1;i++)  // 2 2 3 4 5 // pos =3
                    {
                        arr[i] = arr[i+1];  // left shift

                    }
                arr[arr.length -1] = 0 ;
                //return data;    // 3
                // 2 2 4 5 0
            }

    public void removeDuplicatever04()
        {       // O(n) Time Complexity // Best solution , if asked in an interview I'll drop this one after the brute force and hasing one is done
             HashSet<Integer> h = new HashSet<>();
             for (int i = 0; i < arr.length; i++) {
                 h.add(arr[i]);
             }
             int i = 0;
             Arrays.fill(arr, -999);
             for (int a : h) {
                 arr[i] = i++;
             }
        }

    public void removeDuplicatever01()
        {

                int[] tar = new int[arr.length];
                // 0 0 0 0 0

                int i,j,tar_index = -1;
                int flag ;

                for(i=0;i<arr.length;i++)
                    {   flag =0;
                        for(j=0;j<=tar_index;j++)
                            {
                                if(arr[i] == tar[j])
                                    {
                                        flag =1;
                                        break;


                                    }
                            }
                        if(flag == 0)
                            {   tar_index = tar_index +1;
                                tar[tar_index] = arr[i];
                            }


                    }
//                for(;tar_index<arr.length;tar_index++)
//                    {
//                        tar[tar_index] = 0 ;
//                    }

                arr = tar;
        }


    public void removeDuplicatever02()
    {   // O(n^2) but with reduced Space Complexity

      int i,j;
      for(i=0;i<arr.length;i++)
        {
            for(j = i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                        {
                            deleteByPosition(j);
                        }
                }
        }
    }

    public void removeDuplicateVer3()
            {       // O(n) TC
                int[] chk = new int[100];
                int i,j;
                int Index_of_chk;

                for(i =0; arr[i] != -999;i++)
                    {
                        Index_of_chk = arr[i];
                        chk[Index_of_chk]++;
                        // We populate the chk array with no. of times a value has occured index wise

                    }
                // Traversing arr again;
                for(i=0,j=0;arr[i] !=-999;i++)
                    {
                        Index_of_chk = arr[i];
                        if(chk[Index_of_chk] > 1)
                            {  // j=j+1;
                                arr[j] = Index_of_chk;
                                chk[Index_of_chk] = 0;
                                j++;

                            }
                    }
                j ++ ;
                arr[j] = -999;

            }





}
