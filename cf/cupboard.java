import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class i_love_coder1 {

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
            System.out.println(1);
            return;
        }
           int min=Math.min(a[0],a[1]),max = Math.max(a[0],a[1]);
           int count=1;
          for(int i=2;i<n;i++){
           if(a[i]>max || a[i]<min)
               count++;
           min = Math.min(min,a[i]);
           max = Math.max(max,a[i]);
            
        }
          System.out.println(count);
    }
    
}
