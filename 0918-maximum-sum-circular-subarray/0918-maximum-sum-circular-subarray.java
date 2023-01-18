class Solution {
    public int kadanes(int [] nums){
        int local = nums[0];
        int global = nums[0];
        
        for(int i=1;i<nums.length;i++){
            local = Math.max(local+nums[i], nums[i]);
            global = Math.max(global, local);
        }
        return global;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        //case 1: within the array itself
        int maxSubArraySum = kadanes(nums);
        if(maxSubArraySum<0) return maxSubArraySum;
        //case 2: when in circular array
        
        int totalSum = 0;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
            nums[i]= -nums[i];
        }
        
        int minSubArraySum = kadanes(nums);
        return Math.max(maxSubArraySum, totalSum + minSubArraySum);
        
    }
}