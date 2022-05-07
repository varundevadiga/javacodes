import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class ultrafast {

    /**
     * @param args the command line arguments
     */
    static String getXOR(String a, String b)  
    {  
      
        // Lengths of the given strings  
        int aLen = a.length();  
        int bLen = b.length();  
      
       
      
        // Updated length  
        int len = Math.max(aLen, bLen);  
      
        // To store the resultant XOR  
        String res = "";  
          
        for (int i = 0; i < len; i++) 
        {  
            if (a.charAt(i) == b.charAt(i))  
                res += "0";  
            else
                res += "1";  
        }  
        return res;  
    }  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
       // String s = sc.next();
        String s1 = sc.next();
        String s2 = sc.next();
       
        
        System.out.println(getXOR(s1,s2));
        
    }
    
}
