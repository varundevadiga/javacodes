 static int[] acmTeam(String[] topic) {
   int n = topic.length;
   BigInteger bi[] = new BigInteger[n];
    for(int i=0;i<n;i++)
    bi[i] = new BigInteger(topic[i],2);
    //System.out.println(bi[1]);
    int maxtopic=0;
    int count=0;



      for(int i=0;i<n;i++){
         // int k=0;
          for(int j=i+1;j<n;j++){
              BigInteger iuj = bi[i].or(bi[j]);
              
              int bitcount = iuj.bitCount();
             // System.out.println(bitcount);
              if(bitcount>maxtopic){
                  maxtopic=bitcount;
                  count=1;
              }
              else if(bitcount==maxtopic)
              count++;
          }
      }
      int []res = {maxtopic,count};


return res;
    }