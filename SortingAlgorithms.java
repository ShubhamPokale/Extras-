package Sorting;

public class SortingAlgorithms {

//Sorting Algorithms
    // Bubble sort
    //ver 1
    // Basic version )
    // ver 2
    // ver 3
    //Selection Sort
    // Merge Sort
    // Quick Sort


    public static void main(String[] args) {
        int[] arr = new int[]{2,1,4,3,20,19,6};
       // BubbleSort sort1 = new BubbleSort();
//        System.out.println("Before sorting : ");
//        sort1.printArray(arr);
//        sort1.bubbleSortVer01(arr);
//        System.out.println("\nAfter sorting : ");
//        sort1.printArray(arr);

//        sort1.bubbleSortVer02(arr); // optimized version of bubble sort
//        sort1.printArray(arr);


//        SelectionSort sort2 = new SelectionSort();
//        System.out.println("\nBefore sorting using selection sort : ");
//        sort2.printArray(arr);
      //  sort2.selectionSortVersion00(arr);
       // System.out.println("\nAfter sorting using Selection sort : ");
       // sort2.printArray(arr);
//        System.out.println("\nAfter sorting using in place solution : ");
//        sort2.selectionSortVersion01(arr);
//        sort2.printArray(arr);

        InsertionSort sort3 = new InsertionSort();
        System.out.println("Before sorting the array : ");
        sort3.printArray(arr);
        sort3.insertionSortVer01(arr, arr.length);
        System.out.println("\nAfter sorting the Array : ");
        sort3.printArray(arr);

    }

}
