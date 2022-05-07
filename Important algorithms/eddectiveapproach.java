import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class eddectiveapproach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
         int c1=0,c2=0;
        int q = sc.nextInt();
       
        while(q-->0){
            int x = sc.nextInt();
            for(int i=0;i<n;i++){
                if(a[i]!=x)
                    c1++;
                else{
                    c1++;
                     break;
                }
                   
            }
            for(int i=n-1;i>=0;i--){
                if(a[i]!=x)
                    c2++;
                else{
                    c2++;
                    break; 
                }
                   
            }
        }
        System.out.println(c1+" "+c2);
        
    }
    
}
