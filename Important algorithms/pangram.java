import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Varun
 */
public class pangram {

    /**
     * @param args the command line arguments
     */
    
    public static boolean checkPanagram  (String s)
    {
        // your code here
        String str = s.replaceAll("[^a-zA-Z]", "");
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
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          int n  = Integer.parseInt(bf.readLine());
         String s  = (bf.readLine());
         
         boolean res = checkPanagram(s);
         if(res)
             System.out.println("YES");
         else
             System.out.println("NO");
         
    }
    
}
