class SquareRoot
{
     long floorSqrt(long x)
	 {
		// Your code here
		long ans=0;
		if(x==0 || x==1)
		return x;
		long start=1,end=x;
		while(start<=end){
		    long mid=(start+end)/2;
		    if(mid*mid==x)
		    return mid;
		    if(mid*mid<x){
		        start=mid+1;
		        ans =mid;
		    }
		    else
		    end=mid-1;
		    
		    
		    
		}
		return ans;
	 }
}