// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int m, int n, String s1, String s2)
    {
        char [] X = s1.toCharArray();
        char [] Y = s2.toCharArray();
        
        int L[][] = new int[m+1][n+1]; 

    /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
        that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
    for (int i=0; i<=m; i++) 
    { 
    for (int j=0; j<=n; j++) 
    { 
        if (i == 0 || j == 0) 
            L[i][j] = 0; 
        else if (X[i-1] == Y[j-1]) 
            L[i][j] = L[i-1][j-1] + 1; 
        else
            L[i][j] = max(L[i-1][j], L[i][j-1]); 
    } 
    } 
return L[m][n]; 
} 
static int max(int a, int b) 
{ 
    return (a > b)? a : b; 
} 
    }
    
