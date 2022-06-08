class Solution {
    int [] nums;
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        this.nums = nums;
        while(left<right)
        {
            int mid = left + (right-left)/2;
            if(isPeak(mid))
            {
                right = mid;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
    public boolean isPeak(int mid)
    {   
        if( nums[mid]>nums[mid+1])
        {
            return true;
        }
        return false;
    }
}