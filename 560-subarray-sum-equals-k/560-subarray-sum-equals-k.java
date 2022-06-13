class Solution {
    public int subarraySum(int[] nums, int k) {
      int count = 0;
      int [] prefix = new int[nums.length+1];
      prefix[0]=0;
      for(int i=1;i<=nums.length;i++)
      {
        prefix[i]=prefix[i-1]+nums[i-1];
      }
        
      for(int start = 0;start<nums.length;start++)
      {
          for(int end = start+1;end<=nums.length;end++)
          {
              if(prefix[end]-prefix[start]==k)
                  count++;
          }
      }
        return count;
    }
}