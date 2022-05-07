 public static int maxEvenOdd(int arr[], int n)
    {
        // your code here
        int res=1;
        for(int i=0;i<n;i++){
            int cur=1;
            for(int j=i+1;j<n;j++){
                if(arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0)
                cur++;
                else
                break;
            }
            res = Math.max(res,cur);
        }
        return res;
    }