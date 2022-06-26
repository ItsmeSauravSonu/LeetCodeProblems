class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int idx = nums.length-1;
        int curr_sum = 0;
        int ans = dp(nums, target, idx, curr_sum);
        return ans;
    }
    public int dp(int []nums, int target, int idx, int curr_sum)
    {
        if(idx<0 && curr_sum==target)
            return 1;
        if(idx<0)
            return 0;
        int positive = dp(nums, target, idx-1,curr_sum+nums[idx]);
        int negative = dp(nums, target, idx-1, curr_sum-nums[idx]);
        
        int res = positive+negative;
        return res;
    }
}