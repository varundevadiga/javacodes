import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class softdrinking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); 
        int l =sc.nextInt();
        int c =sc.nextInt();
        int d=sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int x = k*l/nl;
        int y = p/np;
        int z = c*d;
                

        int res = Math.min(x,y);
        int res1 = Math.min(res,z);
        int count = res1/n;
        System.out.println(count);
    }
    
}
