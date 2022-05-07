
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Varun
 */
public class PanoramixsPrediction {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
         int[] a={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
        int[] np=new int[60];
        for(int i=0;i<a.length-1;i++){
            np[a[i]]=a[i+1];
        }
        if(np[n]==m){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
    
}
