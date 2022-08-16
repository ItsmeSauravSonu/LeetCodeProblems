class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int before = 0;
        int after = 0;
        
        for (int num : nums) {
            after += num;
        }
        
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            after -= nums[i];
            
            int fromLeft = nums[i] * i - before;
            int fromRight = after - (nums.length - i - 1) * nums[i];
            result[i] = fromLeft + fromRight;
            
            before += nums[i];
        }
        
        return result;
    }
}