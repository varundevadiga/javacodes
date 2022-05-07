 public static void seive(long n){
         boolean arr[] = new boolean[n+1];
         Arrays.fill(arr,true);
         
         for(int p=2;p*p<=n;p++){
            if(arr[p]==true){
                for(int i=p*p;i<=n;i+=p)
                arr[i]=false;
            } 
         }
         for(int i=2;i<arr.length;i++){
             if(arr[i]==true)
              System.out.print(i+" ");
         }
         System.out.println();
        
     }