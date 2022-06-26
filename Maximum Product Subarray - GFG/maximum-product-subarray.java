// { Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] nums, int n) {
       long ans = nums[0];
     long ma = ans;
     long mi = ans;
        
    
    for(int i=1;i<n;i++)
    {
        if(nums[i]<0)
        {
            long temp = ma;
            ma = mi;
            mi = temp;
        }
        ma = Math.max(nums[i],ma*nums[i]);
        mi = Math.min(nums[i],mi*nums[i]);
        ans = Math.max(ma,ans);
    }
        return ans;
    }
}