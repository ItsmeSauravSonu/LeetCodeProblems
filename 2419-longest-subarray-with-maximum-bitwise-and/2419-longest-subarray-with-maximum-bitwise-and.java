class Solution {
    public int longestSubarray(int[] nums) {
        
        int res = 0, max = 0, count = 0;

        for (int n : nums){
            if (n > max) {
                res = count = 0; 
                max = n;
            }
            count = n == max ? count + 1 : 0;
            res = Math.max(res, count);
        }
        return res;
    }
}