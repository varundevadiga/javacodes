import java.util.Scanner;

/**
 *
 * @author Varun
 */
public class unaryoperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       		String s = new Scanner(System.in).nextLine();
		String ch = "><+-.,[]";
                char ch1[] = s.toCharArray();
		long res =0;
		for(char c:ch1) {
			int x = ch.indexOf(c)+8;
			res = (res *16+x)%1000003;
		}
		System.out.println(res);
    }
    
}
