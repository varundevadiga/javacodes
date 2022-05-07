import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Varun
 */
public class helpfulmath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         String s = bf.readLine().trim();
         String str = s.replace("+", "");
        
         char a[] = new char[str.length()];
         for(int i=0;i<str.length();i++){
             a[i]= str.charAt(i);
         }
         Arrays.sort(a);
          for(int i=0;i<a.length-1;i++){
          System.out.print(a[i]+ "+");
          }
          System.out.println(a[a.length-1]);
          
    }
    
}
