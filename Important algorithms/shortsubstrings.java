import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class shortsubstrings {

    /**
     * @param args the command line arguments
     */
    static String compute(String a){
        int len = a.length();
        String ans="";
        ans+=a.charAt(0);
        if(len==2)
            return a;
        
        for(int i=1;i<len-1;i+=2){
            ans+=a.charAt(i);
        }
        ans+=a.charAt(len-1);
        
        
        return ans;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String a = sc.next();
            String res =  compute(a);
            System.out.println(res);
        }
        
    }
    
}
