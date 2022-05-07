import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class bits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int count=0;
          while(n-->0){
          String a = sc.next();
          if(a.contains("++X")||a.contains("X++"))
              count++;
          else
              count--;
    }
          System.out.println(count);
    }
    
}
