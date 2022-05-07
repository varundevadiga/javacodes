import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Varun
 */
public class jun10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         String s  = (bf.readLine());
         String str = s.replaceAll("[aeiouyAEIOUY]", "");
         str = str.toLowerCase();
         char ch[] = str.toCharArray();
         for(char i:ch){
             System.out.print("."+i);
         }
        
        
    }
    
}
