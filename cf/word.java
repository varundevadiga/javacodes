import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int u=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                u++;
            else
                l++;
        }
        if(u==l)
        System.out.println(s.toLowerCase());
        else if(u>l)
            System.out.println(s.toUpperCase());
        else
            System.out.println(s.toLowerCase());
    }
    
}
