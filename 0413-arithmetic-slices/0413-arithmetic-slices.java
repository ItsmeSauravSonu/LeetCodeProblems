class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int len = nums.length;
        // if length < 3, it means there is no arithmetic slice
        if (len < 3) {
            return 0;
        }
        
        int[] dp = new int[len];
        
        for (int i = 2; i < len; i++) {
            int itemI = nums[i];
            int itemJ = nums[i - 1];
            int itemK = nums[i - 2];
            
            int diffA = itemI - itemJ;
            int diffB = itemJ - itemK;
            
            // it's an arithmetic sequence
            if (diffA == diffB) {
                dp[i] = dp[i - 1] + 1;
            }
        }
        
        int result = 0;
        for (int value : dp) {
            result += value;
        }
        
        return result;
    }
}
