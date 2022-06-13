class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        
        Arrays.sort(nums);
        
        
       for(int i=0;i<nums.length-2;i++)
       {
        int left = i+1;
        int right = nums.length-1;
           
        while(left<right)
        {
            int currSum = nums[i]+nums[left]+nums[right];
            if(currSum==0)
            {
               ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }else if(currSum<0)
            {
                left++;
            }else if(currSum>0)
            {
                right--;
            }
        }
       }
        return new ArrayList(ans);
    }
}