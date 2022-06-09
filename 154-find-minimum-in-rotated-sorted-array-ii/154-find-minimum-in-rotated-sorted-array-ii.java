class Solution {
    public int findMin(int[] nums) {
      int min = nums[0];
        for (int val : nums)
        {
            if (min > val)
            {
                min = val;
            }
        }
        
        return min;  
    }
}