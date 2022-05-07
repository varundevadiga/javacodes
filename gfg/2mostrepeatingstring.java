import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static String first(String[] str){
         HashMap<String,Integer> map=new HashMap<>();
		    for(int i=0;i<str.length;i++)
		    {
		        String ch=str[i];
		        if(!map.containsKey(ch))
		        {
		            map.put(ch,1);
		        }
		        else
		        {
		            map.put(ch,map.get(ch)+1);
		        }
		    }
		    int max=Integer.MIN_VALUE;
		  
		    for(int j=0;j<str.length;j++)
		    {
		        String c=str[j];
		       
		        if(map.get(c)>max)
		        {
		           max = map.get(c);
		           
		         
		        }
		     }
		     int smax = Integer.MIN_VALUE;
		     for(int i=0;i<str.length;i++){
		         if(map.get(str[i])!=max){
		             int res = map.get(str[i]);
		             smax = Math.max(smax,res);
		         }
		     }
		  
		     
		     
		     
		     if(max==Integer.MIN_VALUE)
		     return "-1";
		     String ans="";
		       for(int j=0;j<str.length;j++){
		           String res = str[j];
		           if(map.get(res)==smax)
		           ans = res;
		       }
		   
		     return ans;
    }
     
	  
	public static void main (String[] args) {
	
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n = s.nextInt();
		    String []str= new String[n];
		    for(int i=0;i<n;i++)
		    str[i]=s.next();
		    System.out.println(first(str));
		    
		   
		   
		    
		}
	}
}
//output

Input:
2
6
aaa bbb ccc bbb aaa  aaa
6
geeks for geeks for geeks aaa

Output:
bbb
for