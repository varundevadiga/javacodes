import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class wordcapitalization {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        String s = sc.next();
       // int u=0,l=0;
      //  for(int i=0;i<s.length();i++)
       // {
            if(Character.isUpperCase(s.charAt(0))){
                System.out.println(s);
                return;
            }
            else{
             s =  s.substring(0,1).toUpperCase()+s.substring(1);
              System.out.println(s);
              return;
            }
              //  u++;
          //  else
          //      l++;
       // }
    }
    
}
