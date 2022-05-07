import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class wrongsubtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long k = sc.nextInt();
        //long temp=n;
        for(int i=1;i<=k;i++){
            if(n%10==0){
                n = n/10;
            }
            else{
                n=n-1;
            }
        }
        System.out.println(n);
    }
    
}
