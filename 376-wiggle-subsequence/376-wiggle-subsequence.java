class Solution {
    public int wiggleMaxLength(int[] nums) {
        
        if (nums.length <= 1) 
            return nums.length;
    
        int ans = nums.length;
        Boolean sign = null;
    
        for (int i = 0; i < nums.length-1; i++)
        {
            int temp = nums[i+1] - nums[i];
            if (temp == 0) 
                ans--;
            
            else if (sign == null) 
                sign = temp > 0;
            
            
            else if ((temp > 0 && sign) || (temp < 0 && !sign))
                ans--;
            
            else
                sign = !sign;
        }
        return ans;
    }
}