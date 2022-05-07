 public boolean isValidIP(String s) {
        // Write your code here
        int len = s.length();
        
        s = s.replaceAll("\\.$", "");
       
        int len1 = s.length();
        if(len!=len1)
        return false;
        
        String []str = s.trim().split("\\.");
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length();j++){
             //   System.out.println((int)str[i].charAt(j));
                if((int)str[i].charAt(j)<48 || (int)str[i].charAt(j)>57 )
                return false;
            }
        }
       // System.out.println("hi");
        if(str.length==0 || str.length<4 ||  str.length>4)
        return false;
       
      //  System.out.print(Arrays.toString(str));
        for(int i=0;i<str.length;i++){
           
            if(str[i].length()==0 || str[i].length()>3)
            return false;
            if(str[i].length()>1){
                
               // for(int i=0;i<str[i].length();i++){
                    if(str[i].charAt(0)=='0')
                    return false;
               // }
            }
             
            
               //  System.out.println("hi");
                int j = Integer.parseInt(str[i]);
              //  System.out.println(j);
                if(j<0 || j>255)
                return false;
            
        }
        return true;
    }