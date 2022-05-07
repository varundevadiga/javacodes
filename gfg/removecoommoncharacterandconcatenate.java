class RemoveCommon{
    
    // Function which concatenate two strings
    // after removing common characters
    public static String concatenatedString(String s1,String s2){
       
      int occur[] = new int[26];

     for(int i = 0; i < s1.length(); i++)
     {
      occur[s1.charAt(i)-'a'] = 1;
      }

      for(int i = 0; i < s2.length(); i++)
     {
       if(occur[s2.charAt(i)-'a'] == 1 || occur[s2.charAt(i)-'a'] == 2)
    {
     occur[s2.charAt(i)-'a'] = 2;
     }
   else
    {
   occur[s2.charAt(i)-'a'] = 3;
    }
    }

    String temp="";
    s1 += s2;
      for(int i = 0; i < s1.length(); i++)
      {
      if(occur[s1.charAt(i)-'a'] == 1 || occur[s1.charAt(i)-'a'] == 3)
   {
     temp += s1.charAt(i);
    } 
      }
      if(temp=="")
      return "-1";

    return temp;

        
    }
}

//output

Input:
2
aacdb
gafd
abcs
cxzca
Output:
cbgf
bsxz

Explanation:
Testcase 1:The common characters of s1 and s2 are: a, d.The uncommon characters of s1 and s2 are: c, b, g and f. Thus the modified string with uncommon characters concatenated is: cbgf.
Testcase 2: The common characters of s1 and s2 are: a,c . The uncommon characters of s1 and s2 are: b,s,x and z.Thus the modified string with uncommon characters concantenated is: bsxz.