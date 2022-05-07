 static int subArraySum(int arr[], int n, int sum)
    {
        
           int ctr=0;
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    int prefix_sum = 0;
    for(int num:arr){
        prefix_sum += num;
        if(prefix_sum==sum)
			ctr++;
        if(hm.containsKey(prefix_sum-sum))
            ctr+=hm.get(prefix_sum-sum);
        if(hm.containsKey(prefix_sum))
            hm.put(prefix_sum, hm.get(prefix_sum)+1);
        else
            hm.put(prefix_sum, 1);
    }
    return ctr;
    }