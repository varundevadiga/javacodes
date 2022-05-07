import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

/**
 *
 * @author Varun
 */
public class twins{

    /**
     * @param args the command line arguments
     */
    static void compute(Integer []a,int n){
        int sum=0;
     for(int i:a)
         sum+=i;
    
        int res = sum/2;
        int sum1=0;
        int count=0;
        Arrays.sort(a, Collections.reverseOrder());
       
        for(int i:a){
            sum1+=i;
            count++;
            if(sum1>res)
                break;
        }
		
        
        System.out.println(count);
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(bf.readLine().trim());
      Integer a[] = new Integer[s];
      StringTokenizer st = new StringTokenizer(bf.readLine());
      for(int i=0;i<s;i++)
          a[i]=Integer.parseInt(st.nextToken());
     
     

   
        
       
    
       
        compute(a,s);
       
    }
    
}
