class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]==0){
                count=0;
            }
            maxi = Math.max(maxi, count);
        }
        return maxi;
    }
}