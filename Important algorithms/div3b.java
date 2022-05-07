import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author Varun
 */
public class div3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       
       while(t-->0){
           int n = Integer.parseInt(br.readLine());
           Set<Integer> set = new LinkedHashSet<>();
           int a[] = new int[2*n];
           StringTokenizer st  = new StringTokenizer(br.readLine());
           for(int i=0;i<2*n;i++)
           a[i] = Integer.parseInt(st.nextToken());
           for(int i:a)
               set.add(i);
           for(int i : set)
               System.out.print(i+" ");
           System.out.println();
           
          /* String s[] = br.readLine().trim().split(" ");
           long x  = Long.parseLong(s[0]);
             long y  = Long.parseLong(s[1]);
               long z  = Long.parseLong(s[2]);
               long res = Math.max(Math.max(x, y), z);
               int c = 0;
               if(x==res)
                   c++;
               if(y==res)
                   c++;
               if(z==res)
                   c++;
             //  System.out.println(res + " " + c);
               if(x==y && y==z)
               {
                   System.out.println("YES");
                   System.out.println(x + " " + y + " " + z);
               }
              else if(c==2){
                  long k=0;
                  if(res!=x)
                     k=x;
                  else if(res!=y)
                      k=y;
                  else
                      k=z;
                  System.out.println("YES");
                  System.out.print(res + " " + 1 + " " + k );
                  System.out.println();
                   
               }
               else{
                   System.out.println("NO");
               }
*/
                   
       }
    }
    
}
