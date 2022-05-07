#include<iostream>
using namespace std;
int main()
 {
     int t;
     cin>>t;
     while(t--)
     {
         int n,i,x;
         cin>>n;
         int a[n],j=n-1,k=0;
         for(i=0;i<n;i++)
         {
             cin>>x;
             if(x==0)
                 a[j--]=x;
             else
                 a[k++]=x;
         }
         for(i=0;i<n;i++)
            cout<<a[i]<<" ";
         cout<<endl;
     }
	return 0;
}