import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class team {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        if(a.compareToIgnoreCase(b)<0)
        System.out.println("-1");
        else if(a.compareToIgnoreCase(b)>0)
            System.out.println("1");
        else
            System.out.println(0);
    }
    
}
