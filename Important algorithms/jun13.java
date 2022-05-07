import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Varun
 */
public class jun13 {

    /**
     * @param args the command line arguments
     */
    static void compute(int k,int n,int w){
        int sum=0;
        for(int i=1;i<=w;i++){
            sum += k*i;
        }
        if(sum<n){
            System.out.println(0);
        }
        else{
             System.out.println((long)Math.abs(sum-n));
        }
       
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s[] = bf.readLine().trim().split(" ");
        
        int k = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        compute(k,n,w);
       
    }
    
}
