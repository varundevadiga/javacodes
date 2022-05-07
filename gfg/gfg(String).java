//Palindromic string
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while(t-- > 0){
            String s = scan.next();
            int []a = new int[26];
            for(int i=0;i<s.length();i++){
                int pos = s.charAt(i)-'a';
                a[pos]++;
            }
            for(int i=25;i>=0;i--){
                if(a[i] != 0){
                    for(int j=0;j<a[i];j++){
                        char ch =(char) (i+97);
                        System.out.print(ch);
                    }
                }
            }
            System.out.println();
        }
	}
}
///
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String s = sc.next();
		    char[] a =s.toCharArray();
		    
		    Arrays.sort(a);
		    s = new String(a);
		    StringBuffer str = new StringBuffer(s);
		    System.out.println(str.reverse());
		    }
       
	 }
}