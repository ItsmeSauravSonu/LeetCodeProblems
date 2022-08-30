class Solution {
    public boolean valid(int [] nums, int mid, int op){
        
        for(int val: nums){
            op-=val/mid;
            if(val%mid==0) op++;
        }
        return op>=0;
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int low = 1;
        int high = -1;
        for(int i: nums) high=Math.max(high,i);
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(valid(nums, mid, maxOperations)==true)
            {
                ans = mid;
                high=mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}