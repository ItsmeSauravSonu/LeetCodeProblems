class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int i=0, j=k-1;
        if(n==1) return 0;
        int ans = Integer.MAX_VALUE;
        while(j<n){
            int low = nums[i];
            int high = nums[j];
            i+=1;
            j+=1;
            ans = Math.min(ans, high-low);
        }
        return ans;
    }
}