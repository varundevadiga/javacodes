import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Varun
 */
public class luckydiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
       
        for(int i=0;i<s.length();i++){
            if(Integer.parseInt(String.valueOf(s.charAt(i)))!=4 && Integer.parseInt(String.valueOf(s.charAt(i)))!=7){
                if(Integer.parseInt(s)%4!=0 && Integer.parseInt(s)%7!=0){
                     System.out.println("NO");
                     return;
                }
            }
            
           
        }
        
        
        
            System.out.println("YES");
     
           
        
        
      
        
       
    
       
        
    }
    
}
