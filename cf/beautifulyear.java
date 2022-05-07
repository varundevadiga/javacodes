import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class beautifulyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n>=1987 && n<2013){
            System.out.println(2013);
            return;
        }
        
        for(int i=n+1;i<=10000;i++){
            HashSet<Character> hs = new HashSet<>();
            String s = Integer.toString(i);
            //System.out.println(s);
            outer:
            for(int j=0;j<s.length();j++){
                hs.add(s.charAt(j));
            }
            if(hs.size()==4){
                System.out.println(s);
                return;
            }
            
              
               
            }
       
            
        }
    }
    
