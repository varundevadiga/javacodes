import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

/**
 *
 * @author Varun
 */
public class chatroom{

    /**
     * @param args the command line arguments
     */
    static void compute(String s){
        int sum=0;
     //   String s1 = "hello";
      		String ref = "hello";
		
		int j = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ref.charAt(j)){
				j++;
				if(j == 5)break;
			}
		}
		String ans = (j == 5)? "YES" : "NO";
		
		
        
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine().trim();
        
       
        compute(s);
       
    }
    
}
