import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class learnmath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        	        if(n%2==0){
	        	System.out.println(4+" "+(n-4));
	        }
	        else{
	        	System.out.println(9+" "+(n-9));
	        }
    }
    
}
