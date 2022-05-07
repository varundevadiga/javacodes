import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 //code
	 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	 int t = Integer.parseInt(bf.readLine());
	 while(t-->0){
	     ArrayList<Integer> arr = new ArrayList<>();
	    int n = Integer.parseInt(bf.readLine());
	     String s[] = bf.readLine().trim().split(" ");
	     boolean flag=false;
	     for(int i=0;i<n;i++){
	         s[i]=s[i].replaceAll("[^1-3]","@");
	         
	         if(!s[i].contains("@")){
	             arr.add(Integer.parseInt(s[i]));
	         flag=true;
	         }
	        
	     }
	    Collections.sort(arr);
	     StringBuffer sb = new StringBuffer();
	     if(!flag)
	     System.out.print(-1);
	     else{
	         for(int i=0;i<arr.size();i++){
	            sb.append(arr.get(i)+ " ");
	         }
	         System.out.print(sb);
	     }
	     System.out.println();
	 }
	 }
}