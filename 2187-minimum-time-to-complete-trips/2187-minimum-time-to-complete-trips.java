class Solution {
     public boolean check(int[] nums , int t, long ans){
        long time = t;
        for(int i = 0 ; i < nums.length ; i++){
            time -= ans/nums[i];
            if(time <= 0) return true;
        }
        
        return false;
    }
    public long minimumTime(int[] nums, int t){
       long lo = 1, hi = Long.MAX_VALUE, mid = 0;
        long ans = Long.MAX_VALUE;
        while(lo <= hi){
            mid = lo + (hi-lo)/2;
            boolean val = check(nums,t,mid);
            if(val == true){
                ans = Math.min(ans,mid);
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
   
}