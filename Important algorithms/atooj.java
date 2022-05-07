import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class atooj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int count=0;
          while(n-->0){
        int a = sc.nextInt();
        int b = sc.nextInt();
         int c = sc.nextInt();
         if(a==1 && b==1 || a==1 && c==1 || b==1&&c==1 || a==1&&b==1&&c==1)
             count++;
             
          }
          System.out.println(count);
     
    }
    
}
