import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class boyorgirl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = new Scanner(System.in).nextLine();
        int a[] = new int[26];
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(a[i]!=0)
                count++;
        }
            
        if(count%2==0)
        System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
    
}
