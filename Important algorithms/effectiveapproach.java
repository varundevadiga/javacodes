import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class effectiveapproach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fr = new Scanner(System.in);
        int n = fr.nextInt();
        int[] pos = new int[(int) (1e5 + 3)];
 
        // since indices and queries in same range
        // have indices as value and queries as indices
 
        for (int i = 0; i < n; i++) {
            pos[fr.nextInt()] = i + 1;
        }
 
        int m = fr.nextInt();
       // int[] queries = new int[m];
 
 
        long vCount =0, pCount=0;
 
 
        for (int i = 0; i <m ; i++) {
            int q  = fr.nextInt();
            vCount += pos[q];
            pCount += n - pos[q] + 1;
        }
 
       
 
        System.out.println(vCount +" "+ pCount);
    }
    
}
