class Solution {
    int [] nums;
    
    public int findMin(int[] nums) {
        this.nums = nums;
        
        int left = 0;
        int right = nums.length-1;
        
        while(left<right)
        {
            int mid = left + (right-left)/2;
            if(condition(mid, left, right))
            {
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return nums[left];
    }
    private boolean condition(int mid, int left, int right)
    {
       if(nums[mid]<nums[right]){
           return true;
       } 
        return false;
    }
}
