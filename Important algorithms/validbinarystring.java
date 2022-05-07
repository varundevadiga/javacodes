 public static int minimumMoves(String s, int d) {
   
    int len = s.length(), count=0, idx=-1;
  
    for(int i = 0; i<len; ++i)
    {
        if(s.charAt(i) == '1') idx=i;
        if(idx < i-d+1)
        {
            idx = i;
            count++;
        }
    }
    return count;

    }

//
00100  2
