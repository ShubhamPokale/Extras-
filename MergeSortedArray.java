public class MergeSortedArray {


    public static void main(String[] args) {
    
      // arr1 = new int[6];
        int[]  arr1 = new int[]{0, 2, 4, 6, 8, 10}; // 6
        int[] arr2 = new int[]{1,3,2,7,9};

        int i=0,j = 0,k=0;
        int[] res = new int[(arr1.length+arr2.length)];
       // int[] res = new int[10];
        while(i < arr1.length && j < arr2.length)
            {
                if(arr1[i] < arr2[j])
                    {
                        res[k++] = arr1[i++];
                    }
                else
                    {
                        res[k++] = arr2[j++];
                    }
            }

                while(i<arr1.length)
                    {
                        res[k++] = arr1[i++];

                    }

                while(j<arr2.length)
                    {
                        res[k++] = arr2[j++];
                    }

        System.out.println("Array 1 is " );
        for(int t = 0 ; t<arr1.length;t++)
        {

            System.out.print(arr1[t] + " ");

        }
        System.out.println("\nArray 2 is ");
        for(int t = 0 ; t<arr2.length;t++)
        {

            System.out.print(arr2[t] + " ");

        }

        System.out.println("\nSorted merged array : ");
        for(int t = 0 ; t<res.length;t++)
            {

                System.out.print(res[t] + " ");

            }


    }

}
