 public static void reverseWords(String str) {
     String rev="";
     String word="";
     for(int i=0;i<str.length();i++){
         if(str.charAt(i)=='.'){
             rev=word+'.'+rev;
             word="";
         }
         else
         word=word+str.charAt(i);
     }
     rev=word+'.'+rev;
     for(int i=0;i<rev.length()-1;i++)
        System.out.print(rev.charAt(i));
   }