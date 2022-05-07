import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class tram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
            return;
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int ex =sc.nextInt();
            sum-=ex;
            int en = sc.nextInt();
            sum+=en;
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
    
}
