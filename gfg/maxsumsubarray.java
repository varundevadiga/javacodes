  
    public static int maxSubArray(ArrayList<Integer> array)
    {
        // code here.
        int res = array.get(0);
        int maxending = array.get(0);
        for(int i=1;i<array.size();i++){
            maxending = Math.max(maxending+array.get(i),array.get(i));
            res = Math.max(maxending,res);
        }
        
        return res;
    }