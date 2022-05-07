
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class honestcatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int min = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    min = Math.min(min, Math.abs(a[i]-a[j]));
                }
            }
            System.out.println(min);
        }
        
    }
    
}
