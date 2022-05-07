#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int NthRootM(int n,long m)
{
    for(int i=1;i<=sqrt(m);i++)
     if(pow(i,n)==m)
      return i;
      
     return -1;
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        long m;
        cin>>n>>m;
        
        cout<<NthRootM(n,m)<<endl;
    }

  
  return 0;
  
}