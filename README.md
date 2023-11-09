# Extras-

Selection Sort  : 
   public void selectionSortVersion01(int[] arr) // In place solution
        {   int n = arr.length;
            int i,j;   1 5 2 9 10 18
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


           Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
