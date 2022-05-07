import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class caps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
       
                 char[] s = sc.next().toCharArray();
                boolean uppercase_flag = true;
                boolean firstletter = (s[0] > 'Z');
                for(int i = 1; i < s.length; i++)
                {
                    if(s[i] > 'Z')
                        uppercase_flag = false;
                }
                if(uppercase_flag)
                {
                    for(int i = 0; i < s.length; i++)
                    {
                        if(s[i] < 'a')s[i] += 32;
                        else s[i] -= 32;
                    }
                }
                StringBuilder sb = new StringBuilder();
                for(char ch : s)sb.append(ch + "");
               
        
        
            System.out.println(sb.toString());
    }
    
}
