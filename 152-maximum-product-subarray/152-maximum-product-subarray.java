class Solution {
    public int maxProduct(int[] nums) {
      int n=nums.length;
        int x=nums[0];
        int y=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++)
        {
            int t=Math.max(nums[i],Math.max(x*nums[i],y*nums[i]));
            y=Math.min(nums[i],Math.min(x*nums[i],y*nums[i]));
            x=t;
            ans=Math.max(ans,x);
        }
        return ans;
    }
}