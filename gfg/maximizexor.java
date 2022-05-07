  static int maximizingXor(int l, int r) {
        int max = 0;
        while(l<=r){
        for(int i=l;i<=r;i++){
        int xor = l^i;
         max = Math.max(xor,max);

       }
       l++;
        }
    
    return max;
     
    }