package Sorting;

public class InsertionSort {

    static void insert(int[] arr,int i)
    { int j;
        // Your code here
        int key = arr[i];
        j = i-1;
        while(j>=0 && arr[j] > key)
        {

            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSortVer01(int[] arr, int n)
    {
        int i,j;

        for(i=1;i<n;i++)
        {
            insert(arr,i);

        }

        //code here
    }





    public void printArray(int[] arr)
        {

            for (int j : arr) {
                System.out.print(j + " ");
            }

        }

    public void insertionSort(int[] arr)
        {
            // 20 5 40 60 10 30
            int n = arr.length;
            int i,j,key;
            for(i=1;i<n;i++)        // this would be traversing the unsorted part
                {
                    key = arr[i];
                    j = i-1;
                    while((j >= 0) && arr[j] > key ) // traversing the sorted part
                        {
                            arr[j+1] = arr[j];
                            j--;
                        }

                    arr[j+1] = key;
                }


        }

}
