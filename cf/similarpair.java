import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class similarpair {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        while(s-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int count=0;
            Arrays.sort(a);
            int even=0,odd=0;
            for(int i=0;i<n;i++){
                if(a[i]%2==0)
                    even++;
                odd++;
            }
            if(even%2==0 && odd%2==0)
                System.out.println("YES");
            else{
                int flag=0;
                for(int i=1;i<n;i++){
                    if(a[i]-a[i-1]==1){
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
    
}