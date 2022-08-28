class Solution {
    public int findPeakElement(int[] nums) {
        int size = nums.length;
        int start =0;
        int end = nums.length-1;
        if(size==1){
                return 0;
            }
        while(start<=end){
            
            int mid = start + (end-start)/2;
            if(mid>0 && mid<nums.length-1) { 
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if( nums[mid]<nums[mid-1]){
                end=mid-1;
            }
            else if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }
        }
            else if(mid==0){
            if(nums[0]>nums[1]){
                return 0;
            }
            else{
                return 1;
            }
        }
            else if(mid==size-1){
            if(nums[size-1]>nums[size-2]){
                return size-1;
            }
            else{
                return size-2;
            }
        }
        }
      return -1;
    }
}