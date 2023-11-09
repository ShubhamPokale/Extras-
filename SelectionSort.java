package Sorting;

public class SelectionSort {

    // naive solution
    // Not an in place solution, requires an extra space of arr size

    public void selectionSortVersion00(int[] arr)
        {
            int n = arr.length;
            int[] temp = new int[n];
            int i,j;
            for(i=0;i<n;i++)
                {
                   int  min_index = 0;
                   for(j = 1; j < n ; j++) {
                       if (arr[j] < arr[min_index]) {
                           min_index = j;
                       }
                   }
                        temp[i] = arr[min_index];
                        arr[min_index] = Integer.MAX_VALUE;
                }

            for(i=0;i<n;i++)
                {
                    arr[i] = temp[i];
                }


        }


    public void selectionSortVersion01(int[] arr) // In place solution
        {   int n = arr.length;
            int i,j;
            for(i=0;i<n-1;i++)
                {   int min_index = i;
                    for(j=i+1;j<n;j++)
                        {
                            if(arr[j] < arr[min_index])
                                {
                                    min_index = j;
                                }
                        }
                    // swap the new minimum value to its final positon.
                    //swap(arr[min_index], arr[i]);
                    int temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }
        }

    public void printArray(int[] arr)
    {
        for(int j : arr)
        {
            System.out.print(j + " ");
        }
    }


}



