static void max_of_subarrays(int arr[], int n, int k)
    {
       
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<=n-k;i++)
     {
      int max=arr[i];
     for(int j=i+1;j<k+i;j++){
     if(arr[j]>max)
     max=arr[j];
      }

    sb.append(max+" ");
      }
       System.out.print(sb);
    }

//explanation
Input:
2
9 3
1 2 3 1 4 5 2 3 6
10 4
8 5 10 7 9 4 15 12 90 13
Output:
3 3 4 5 5 5 6
10 10 10 15 15 90 90

Explanation:
Testcase 1: Starting from first subarray of size k = 3, we have 3 as maximum. Moving the window forward, maximum element are as 3, 4, 5, 5, 5 and 6.