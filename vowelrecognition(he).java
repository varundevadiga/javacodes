import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        String testCasesVal = s.nextLine();          
 
        int testCases = Integer.parseInt(testCasesVal);
 
        for(int k=0;k<testCases;k++)
        {
            String str = s.nextLine();
            long len = str.length();
            long vowelCountNew=0;
             for(int i=0;i<len;i++)
            {
                long cnt = vowelCountVal((""+str.charAt(i)));
                if(cnt>0)
                vowelCountNew+=(len-i)*(i+1);
            }
        System.out.println(vowelCountNew);
 
        }
 
 
 
    }
    public static long vowelCountVal(String str)
     {
         long count=0;
         for(int i=0;i<str.length();i++)
         {
             char charVal = str.charAt(i);         
       if(charVal == 'A' || charVal == 'E' || charVal == 'I'  || charVal == 'O' || charVal == 'U' 
       || charVal == 'a' || charVal == 'e' || charVal == 'e' || charVal == 'i' ||charVal == 'o' ||charVal == 'u'  )
       count++;
 
     
       }
       return count;
    }
    
}