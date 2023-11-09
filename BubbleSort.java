package Sorting;

public class BubbleSort {

    public void swap(int[] arr, int index1, int index2)
        {
            //swap logic
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;

        }

    public void printArray(int[] arr)
        {
            for (int j : arr) {
                System.out.print(j + " ");
            }

//            for(int i = 0; i< arr.length;i++)
//            {
//                System.out.println(arr[i] + " ");
//            }
        }



    public void bubbleSortVer01(int []arr)
        {   int n = arr.length;
            int i,j;
            for(i=0; i < n-1;i++)      // 2,1,4,3,20,19,6
                {

                    for(j=0; j<n-1-i;j++)
                        {
                            //swap if the elements are not in order
                            if(arr[j] > arr[j+1])
                                {
                                    //swap
                                     swap (arr, j,j+1);
//                                    int temp = arr[j];
//                                    arr[j] = arr[j+1];
//                                    arr[j+1] = temp;
                                }

                        }
                }
        }

    public void bubbleSortVer02(int[] arr)
        {
                int i,j,n;
                n = arr.length;

                for(i=0;i<n-1;i++)
                    {
                        boolean swapped = false;
                        for(j=0;j<n-i-1;j++)
                            {

                                if(arr[j] > arr[j+1])
                                {   swapped = true;
                                    swap(arr,j,j+1);
//                                    int temp = arr[j];
//                                    arr[j] = arr[j+1];
//                                    arr[j+1] = temp ;
                                }


                            }

                        if(swapped == false)
                            {
                                //System.out.println("The Array is Already sorted ! ");
                                break;
                            }

                    }
        }


}
