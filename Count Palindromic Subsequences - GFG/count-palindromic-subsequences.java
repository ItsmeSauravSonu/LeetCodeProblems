// { Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    long t[][];
    int mod=1000000007;
    long countPS(String s)
    {
int n=s.length();
        t=new long[n+1][n+1];
        for(int g=0;g<n;g++)
       {
           for(int i=0,j=g;j<n;i++,j++)
           {
              if(i==j)
              t[i][j] = 1;
            //   else if(j-i ==1)
            //   t[i][j]=(s.charAt(i)==s.charAt(j))? 3 : 2;
              else
              {
                  if(s.charAt(i)==s.charAt(j))
                  t[i][j]=(t[i][j-1]%mod + t[i+1][j]%mod +1)%mod  ;
                  else
                  t[i][j] = (mod + t[i][j-1]%mod  + t[i+1][j]%mod)%mod  - t[i+1][j-1]%mod ;
              }
           }
       }
       
       return t[0][n-1]%mod;
}
}