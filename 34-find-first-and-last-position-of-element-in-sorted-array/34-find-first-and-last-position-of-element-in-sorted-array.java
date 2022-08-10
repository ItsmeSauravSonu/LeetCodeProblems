class Solution {
    public int[] searchRange(int[] nums, int target) {
    
    int [] ans = new int[2];
        
    int first = left_bound(nums, target);
    int second= right_bound(nums,target);
        
    ans[0]=first;
    ans[1]=second;
        
    return ans;
}
    
    public int left_bound(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                ans = mid;
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    
    public int right_bound(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            
            if(nums[mid]==target){
                ans = mid;
                start = mid+1;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;
    }
    
}