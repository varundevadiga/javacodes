import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Varun
 */
public class luckydiv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
       		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
       
      		if (input % 4 == 0 || input % 7 == 0 || input % 47 == 0 || input % 74 == 0 || input % 44 == 0 || input % 77 == 0
				|| input % 444 == 0 || input % 447 == 0 || input % 474 == 0 || input % 477 == 0 || input % 777 == 0
				|| input % 774 == 0 || input % 747 == 0 || input % 744 == 0)
		{
			System.out.println("YES");
		} else
		{
			System.out.println("NO");
		}
     
           
        
        
      
        
       
    
       
        
    }
    
}
