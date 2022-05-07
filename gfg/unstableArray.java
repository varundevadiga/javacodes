import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class unstableArray {

    /**
     * @param args the command line arguments
     */
    static long unstable(long n,long m){
        if(n==1)
            return 0;
        if(n==2)
            return m;
        else
            return m*2;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n= sc.nextInt();
            long m = sc.nextInt();
            long ans = unstable(n,m);
            System.out.println(ans);
        }
    }
    
}
