import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class mish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=0,c=0;
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b)
                m++;
            if(b>a)
                c++;
        }
        if(m==c)
            System.out.println("Friendship is magic!^^");
        else if(m>c)
            System.out.println("Mishka");
        else
            System.out.println("Chris");
              
     
      
       
}
}
