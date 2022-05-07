import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Varun
 */
public class nextround {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String a[] = bf.readLine().trim().split(" ");
        int l = Integer.parseInt(a[0]);
        int  b = Integer.parseInt(a[1]);
        
        int res = l*b;
        int count=0;
        int inc = 0;
        while(count<res){
            count+=2;
            if(count>res){
                break;
            }
            inc++;
        }
        
      
        
       
    
        System.out.println(inc);
        
    }
    
}
