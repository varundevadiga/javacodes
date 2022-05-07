import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class translation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String r = sc.next();
        StringBuilder sb = new StringBuilder(s);
        // StringBuilder sb1 = new StringBuilder(r);
        sb.reverse();
       // System.out.println(sb+ " " + r);
        if(sb.toString().equals(r))
            System.out.println("YES");
        else
            System.out.println("NO");
        
        
    }
    
}
