class MissingPanagram
{
    // Complete the function
    // str: input string
    public static String missingPanagram(String str)
    {
        
        //System.out.println((char)('a'+25));
      str=str.toLowerCase();
        String r="";
        int f[]=new int[26];
        for(int i=0;i<str.length();i++){
            f[str.charAt(i)-'a']=1;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]==0)
            r=r+((char)('a'+i));
        }
        return r;
    }
}


///
Sample Input:
2
Abcdefghijklmnopqrstuvwxy
Abc
Sample Output:
z
defghijklmnopqrstuvwxyz

Explanation:
Testcase 1: Here all the characters from a to z are present except z.