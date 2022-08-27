class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = new int[2];
        int first = lowerBound(nums, target);
        int second = upperBound(nums, target);
        
        ans[0]=first;
        ans[1]=second;
        
        return ans;
    }
    public int lowerBound(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                if(mid-1>=0 && nums[mid-1]==target) end = mid-1;
                else return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }  
        }
        return res;
    }
     public int upperBound(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                if(mid+1<nums.length && nums[mid+1]==target) start= mid+1;
                else return mid;
            }else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }  
        }
        return res;
    }
}