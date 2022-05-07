import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static String first(String str){
         HashMap<Character,Integer> map=new HashMap<>();
		    for(int i=0;i<str.length();i++)
		    {
		        char ch=str.charAt(i);
		        if(!map.containsKey(ch))
		        {
		            map.put(ch,1);
		        }
		        else
		        {
		            map.put(ch,map.get(ch)+1);
		        }
		    }
		   
		    for(int j=0;j<str.length();j++)
		    {
		        char c=str.charAt(j);
		        if(map.get(c)>1)
		        {
		           
		           return String.valueOf(c);
		        }
		     }
		     return "-1";
    }
     
	  
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    String str=s.next();
		    System.out.println(first(str));
		    
		   
		   
		    
		}
	}
}