import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class evenarray {

    /**
     * @param args the command line arguments
     */
    static int compute(int[] a,int n){
       int  oddoffeven=0,evenofodd=0;
       for(int i=0;i<n;i++){
           if(i%2==0 && a[i]%2!=0)
      {
        evenofodd++;
      }
      if(i%2!=0 && a[i]%2==0)
      {
        oddoffeven++;
      }
       }
       
      
       if(evenofodd==oddoffeven)
    {
        return evenofodd;
    }
   
        return -1;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int res = compute(a,n);
        System.out.println(res);
        
        }
    }
    
}
