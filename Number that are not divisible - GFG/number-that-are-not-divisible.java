// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.noOfNumbers(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long noOfNumbers(Long N) {
        return N - (N/2 + N/3 + N/5 + N/7 - (N/6 + N/10 + N/14 + N/15 + N/21 + N/35) + N/30 + N/105 + N/70 + N/42 - N/210);
    }
};