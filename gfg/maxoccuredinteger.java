
class MaxOccur{
    
    // Function to get maximum occuring 
    // character in given string str
    public static char getMaxOccuringChar(String line){
        
        // Your code here
        int a[] = new int[26];
        
        for(int i=0;i<line.length();i++){
            a[line.charAt(i)-'a']++;
            
        }
         int b[] = new int[a.length]; 
  
      
        for (int i=0; i<a.length; i++) 
            b[i] = a[i]; 
        
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(b[i]==a[a.length-1]){
              return (char)(i+'a');
            }
        }
     
        return 'm';
        
    }
    
}

//output
Input:
2
testsample
output
Output:
e
t

Explanation:
Testcase 1: e is the character which is having highest frequency.
Testcase 2: t and u are the characters with the same frequency, but t is lexicographically smaller.