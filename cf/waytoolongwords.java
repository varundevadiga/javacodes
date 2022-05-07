import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class waytoolongwords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       // outer:
        while(t-->0){
            String s = sc.next();
            if(s.length()<=10)
            {
                System.out.println(s);
                continue;
            }
            int count=0;
            for(int i=1;i<s.length()-1;i++){
                count++;
            }
            String res = "";
            res+=s.charAt(0);
            res+=count;
            res+=s.charAt(s.length()-1);
            System.out.println(res);
        }
    }
    
}
