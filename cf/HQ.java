import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class HQ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        //long k = sc.nextInt();
        //long temp=n;
       // long count=0;
        /*while(n<=k){
            n = n*3;
            k = k*2;
            
           count++;
            
             
        }*/
        boolean b = false;
         for(int i=0;i<n.length();i++){
             if(n.charAt(i)=='H' || n.charAt(i)=='Q' || n.charAt(i)=='9' )
                 b = true;
         }
         if(b)
             System.out.println("YES");
         else
             System.out.println("NO");
     
    }
    
}
