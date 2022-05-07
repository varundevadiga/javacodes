import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class georgeaccommodation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = b-a;
            if(res>=2)
                count++;
        }
        System.out.println(count);
    }
    
}
