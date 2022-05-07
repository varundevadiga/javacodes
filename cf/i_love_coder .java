import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class i_love_coder {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
     
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            
        }
        if(a.length==1)
        {
            System.out.println(0);
            return;
        }
           int min=a[0],max = a[0];
           int count=0;
          for(int i=1;i<n;i++){
           if(a[i]>max || a[i]<min)
               count++;
           min = Math.min(min,a[i]);
           max = Math.max(max,a[i]);
            
        }
          System.out.println(count);
    }
    
}
