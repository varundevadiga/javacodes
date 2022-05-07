import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class stonesonthetable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)== s.charAt(i+1)){
                count++;
            }
        }
       
          System.out.println(count);
    }
    
}
