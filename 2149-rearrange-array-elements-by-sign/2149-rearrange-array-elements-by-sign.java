class Solution {
    public int[] rearrangeArray(int[] nums) {
       int [] ans = new int[nums.length];
       int j=0, k=1;
       for(int i=0;i<nums.length;i++){
           if(nums[i]>=0)
           {
               ans[j]=nums[i];
               j=j+2;
           }else{
               ans[k]=nums[i];
               k=k+2;
           }
       }
        return ans;
    }
}