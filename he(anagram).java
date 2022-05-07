mport java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       

       
        Scanner scr = new Scanner(System.in);
               int n=scr.nextInt();
        for(int i=0;i<n;i++){
            String a=scr.next();
            String b=scr.next();
            char[]ch1=a.toCharArray();
            char[]ch2=b.toCharArray();
            int i1=ch1.length;
            int i2=ch2.length;
            int count=0;
            for(int j=0;j<i1;j++){
                for(int k=0;k<i2;k++){
                    if(ch1[j]==ch2[k]){
                        count++;
                        ch2[k]=0;
                        break;
                    }
                }
            }
            System.out.println(i1+i2-(2*count));
        }
 




    }
}

// method 2



import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     static int NO_OF_CHARS = 256; 
      static boolean areAnagram(char str1[], char str2[]) 
    { 
        // Create 2 count arrays and initialize 
        // all values as 0 
        int count1[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count1, 0); 
        int count2[] = new int[NO_OF_CHARS]; 
        Arrays.fill(count2, 0); 
        int i; 
  
        // For each character in input strings, 
        // increment count in the corresponding 
        // count array 
        for (i = 0; i < str1.length && i < str2.length; 
             i++) { 
            count1[str1[i]]++; 
            count2[str2[i]]++; 
        } 
  
        // If both strings are of different length. 
        // Removing this condition will make the program 
        // fail for strings like "aaca" and "aca" 
        if (str1.length != str2.length) 
            return false; 
  
        // Compare count arrays 
        for (i = 0; i < NO_OF_CHARS; i++) 
            if (count1[i] != count2[i]) 
                return false; 
  
        return true; 
    } 
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     String str1 = sc.next();
	     String str2 = sc.next();
	     char a[] = str1.toCharArray();
	      char a2[] = str2.toCharArray();
	      boolean bool = areAnagram(a,a2);
	      if(bool)
	      System.out.println("YES");
	      else
	      System.out.println("NO");
	    
	 }
}
}


//method3

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static boolean areAnagram(char[] str1, char[] str2) 
    { 
        // Get lenghts of both strings 
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        // Compare sorted strings 
       /* for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) */
            if(Arrays.equals(str1,str2))
                return true; 
  
        return false; 
    } 
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
	 while(t-->0){
	     String str1 = sc.next();
	     String str2 = sc.next();
	     char a[] = str1.toCharArray();
	      char a2[] = str2.toCharArray();
	      boolean bool = areAnagram(a,a2);
	      if(bool)
	      System.out.println("YES");
	      else
	      System.out.println("NO");
	    
	 }
}
}