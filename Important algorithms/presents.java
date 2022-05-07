import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class presents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        		int[] arr = new int[n];
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt() - 1;
			ans[arr[i]] = i + 1;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
    }
    
}
