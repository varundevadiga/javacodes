import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       

       
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char a[] = str.toCharArray();
        int z = 0;
        int o=0;
        for(int i=0;i<a.length;i++){
           if(a[i]=='z')
           z++;
           else
           o++;
        }
        if(o==2*z)
        System.out.println("Yes");
        else
        System.out.println("No");
        




    }
}
