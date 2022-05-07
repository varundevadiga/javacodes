import java.util.Scanner;
import static java.lang.System.*;

/**
 *
 * @author Varun
 */
public class insomniacure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
                int a = in.nextInt() , b = in.nextInt() , c = in.nextInt() , d = in.nextInt() , n = in.nextInt() + 1 ;
        int ans = 0 ;
        for ( int i = 1 ; i < n ; ++i )
        	if ( i % a == 0 || i % b == 0 || i % c == 0 || i % d == 0 )
        		++ans ;
        out.println(ans);
    }
    
}
