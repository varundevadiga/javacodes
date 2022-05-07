class Main
{
    // Function to sort an array after applying given
    // equation.
    static void sortArray(int arr[], int n, int A, int B, int C)
    {
       // Apply equation on all elements
        for (int i = 0; i < n; i++)
            arr[i] = A*arr[i]*arr[i] + B*arr[i] + C;
     
        // Find maximum element in resultant array
        int index=-1;
        int maximum = -999999;
        for (int i = 0; i< n; i++)
        {
            if (maximum < arr[i])
            {
                index = i;
                maximum = arr[i];
            }
        }
     
        // Use maximum element as a break point
        // and merge both subarrays usin simple
        // merge function of merge sort
        int i = 0, j = n-1;
        int[] new_arr = new int[n];
        int k = 0;
        while (i < index && j > index)
        {
            if (arr[i] < arr[j])
                new_arr[k++] = arr[i++];
            else
                new_arr[k++] = arr[j--];
        }
     
        // Merge remaining elements
        while (i < index)
            new_arr[k++] = arr[i++];
        while (j > index)
            new_arr[k++] = arr[j--];
     
        new_arr[n-1] = maximum;
     
        // Modify original array
        for (int p = 0; p < n ; p++)
            arr[p] = new_arr[p];
    }
    
    // main function
    public static void main (String[] args) 
    {
        int arr[] = {-21 ,-15, 12, 13, 14 };
        int n = arr.length;
        int A = -6, B =-7, C = 2;
     
        sortArray(arr, n, A, B, C);
     
        System.out.println("Array after sorting is : ");
        for (int i=0; i<n; i++)
           System.out.print(arr[i]+" ");
    }
}

/* This code is contributed by Harsh Agarwal */
