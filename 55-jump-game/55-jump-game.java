class Solution {
    public boolean canJump(int[] nums) {
        int lastBestPOS = nums.length-1;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]+i>=lastBestPOS)
                lastBestPOS = i;
        }
        return lastBestPOS == 0;
    }
}