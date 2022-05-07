import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class lamiz{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
       
        long count=0;
        while(n<=k){
            n = n*3;
            k = k*2;
            
           count++;
            
             
        }
         System.out.println(count);
     
    }
    
}