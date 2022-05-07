static boolean findsum(int arr[],int n)
{
    //Your code here
    Set<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        us.add(0);
        for(int i = 0; i < n; i++)
        {
            prefix_sum += arr[i];
            if(us.contains(prefix_sum))
              return true;
              
            us.add(prefix_sum);
        }
        
        return false;
}