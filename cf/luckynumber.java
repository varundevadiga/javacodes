import java.util.*;
public class luckynumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '4' || s.charAt(i)=='7'){
                count++;
            }
        }
        if(count==4 || count==7)
        System.out.println("YES");
        else
        System.out.println("NO");
        
    }
    
}
