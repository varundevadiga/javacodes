import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int count1=0,count2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A')
                count1++;
            else
                count2++;
        }
        if(count1>count2)
        System.out.println("Anton");
        else if(count2>count1)
            System.out.println("Danik");
        else
            System.out.println("Friendship");
    }
    
}
