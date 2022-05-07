import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
        while(t--> 0){
       int radius=sc.nextInt();
         String s=sc.next();
       Map<Character,Integer> map=new LinkedHashMap<>();
      for(char c:s.toCharArray())
     map.put(c,map.getOrDefault(c,0)+1);
    char val=' ';
     for(Map.Entry<Character,Integer> entry:map.entrySet())
    if(entry.getValue()==1)
   {
   val=entry.getKey();
    break;
  }
   if(val==' ')
   System.out.println(-1);
   else
     System.out.println(val);
        }
	 }
}

method 2
/////////////////////////////
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static String ans(String str,int n)
    {
        HashMap<Character,Integer> map=new LinkedHashMap<>();
        String res="";
        for(int i=0;i<n;i++)
        {
            char c=str.charAt(i);
            if(!map.containsKey(c))
            {
                map.put(c,1);
            }
            else
            {
                map.put(c,map.get(c)+1);
            }
        }
        for (int j=0;j<n;j++)
        {
            char c1=str.charAt(j);
            if(map.get(c1)==1)
            {
                res+=c1;
                return res;
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
		    int l=s.nextInt();
		    String str=s.next();
		    System.out.println(ans(str,l));
		}
	}
}
//method 3

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
		public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        int n= Integer.parseInt(br.readLine().trim()); //removing whitespace.
	        String s = br.readLine();
	        nonRepeatingChar(s.toCharArray()); 
	    }
		}
		
		static void nonRepeatingChar(char c[])
		{
		    HashMap<Character,Integer> map = new HashMap<>();
		    Queue<Character> q = new LinkedList<>(); //FIFO. (Find first non repeating char)
		    
		    for(int i=0;i<c.length;i++)
		    {
		       if(!map.containsKey(c[i])) map.put(c[i],1);
		       else map.put(c[i],map.get(c[i])+1);
		    }
		        
		        
		    for(int i=0;i<c.length;i++) 
		    {
		       if(map.get(c[i])==1) q.add(c[i]);
		    }
		    
		    if(!q.isEmpty())
		    System.out.println(q.peek());
		    
		    else
		    System.out.println("-1");
		}
		
}