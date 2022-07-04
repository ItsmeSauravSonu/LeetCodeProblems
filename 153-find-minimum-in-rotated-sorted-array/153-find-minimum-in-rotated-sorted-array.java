class Solution {
    public int findMin(int[] nums) {
       int l =0, len = nums.length, r = len-1;
        int res = nums[l];
        int prev, next;
        while(l<=r){
            //when array is already sorted 
            if(nums[l] <= nums[r]){
                return nums[l];
            }
            
            int mid= l+ (r-l)/2;
            prev = (mid+len-1)%len;
            next = (mid+1)%len;
            
            //mid is less then the prev and the next element
            if(nums[mid]<= nums[prev] && nums[mid] <= nums[next]){
                return nums[mid];
            }
            else if(nums[mid] >= nums[l]){
                l = mid+1;
            }
            else {
                r= mid-1;
            }
            
        }
        
        return res;
    }
}