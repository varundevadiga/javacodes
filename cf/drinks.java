import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class drinks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum = 0;
        while(n-->0){
            sum+=sc.nextInt();
        }

        System.out.printf("%.12f",(sum)/(double)m);
        System.out.println();
        
        
    }
    
}
