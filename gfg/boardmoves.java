import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Varun
 */
public class boardmoves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            long n = sc.nextInt();
            long v = 8;
            long sum=0;
            for(int i=1;i<=n/2;i++){
                sum+=i*v;
                v+=8;
            }
            System.out.println(sum);
        }
    }
    
}
