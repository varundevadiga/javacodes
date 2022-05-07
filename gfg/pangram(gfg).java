 public static boolean checkPanagram  (String s)
    {
        // your code here
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        str = str.toLowerCase();
        int a[]= new int[26];
        for(int i=0;i<str.length();i++){
          //  if(str.charAt(i)
            a[Math.abs(str.charAt(i)-'a')]++;
        }
        
        
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
            return false;
        }
        return true;
        
    }