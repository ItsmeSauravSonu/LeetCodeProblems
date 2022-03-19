class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int pairs = n/2;
        Arrays.sort(nums);
        int count =0;
            
            for(int i=1;i<n;i+=2)
            {
                    if(nums[i]==nums[i-1])
                    {
                            count++;
                    }
            }
            if(count==pairs)
            {
                    return true;
            }
            return false;
    }
}