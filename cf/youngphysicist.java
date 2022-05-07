
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class youngphysicist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x1=0,y1=0,z1=0;
        for(int i=1;i<=n;i++){
            x1+=sc.nextInt();
            y1+=sc.nextInt();
            z1+=sc.nextInt();
        }
        if(x1==0&&y1==0&&z1==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
    
}
