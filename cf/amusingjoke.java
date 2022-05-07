import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Varun
 */
public class amusingjoke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();
          String str1 = br.readLine().trim();
            String str2 = br.readLine().trim();
     int a[] = new int[26];
      int b[] = new int[26];
       for (int i = 0; i < str.length(); i++) {
         a[Math.abs((str.charAt(i)-'A'))]++;
       }
        for (int i = 0; i < str1.length(); i++)
       a[Math.abs((str1.charAt(i)-'A'))]++;
        
         for (int i = 0; i < str2.length(); i++) {
             b[Math.abs(str2.charAt(i)-'A')]++;
         }
          for (int i = 0; i < 26; i++) {
              if(a[i]!=b[i]){
                  System.out.println("NO");
                  return;
              }
          }
         
         System.out.println("YES");
        
         
    }
    
}
