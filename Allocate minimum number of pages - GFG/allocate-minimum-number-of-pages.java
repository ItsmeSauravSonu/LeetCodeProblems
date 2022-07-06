// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
     int start = A[N-1];
     int sum = 0;
     for(int i=0;i<N;i++)
     {
         sum+=A[i];
     }
     int end = sum;
     
     int res = -1;
     while(start<=end)
     {
         int mid = start + (end-start)/2;
         if(isValid(A, N, M, mid)==true)
         {
            res = mid;
            end = mid-1;
         }else{
             start=mid+1;
         }
     }
     return res;
    }
    public static boolean isValid(int [] A, int N, int M, int mid)
    {
        int student = 1;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum = sum + A[i];
            if(sum>mid)
            {
                student++;
                sum = A[i];
            }
            if(student>M)
            {
                return false;
            }
        }
        return true;
    }
};