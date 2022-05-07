
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class B32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer();
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='-'){
                if(a[i+1]=='.')
                    sb.append(1);
                 else
                sb.append(2);
                i++;
            }
            else
                sb.append(0);
        }
        System.out.println(sb);
    }
    
}
