import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class Elephant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println((long)Math.ceil(n/5.00));
    }
    
}
