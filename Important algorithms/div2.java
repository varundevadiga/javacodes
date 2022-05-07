import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Varun
 */
public class div2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        int res = t+1;
        StringTokenizer st;
        int n=0;
          st = new StringTokenizer(bf.readLine());
     while(t-->0){
          
            
          n+= Integer.parseInt(st.nextToken());
         
      }
   // int res = t+1;
 //  System.out.println(res + " "+n);
    int count=0;
    for(int i=1;i<=5;i++){
        if((i+n)%res!=1)
            count++;
    }
    System.out.println(count);
         
         
        
    }
    
}
