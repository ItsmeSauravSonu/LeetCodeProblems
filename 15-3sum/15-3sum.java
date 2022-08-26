class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        int size = nums.length;
        
        if(size < 3 || nums == null)
            return result;
        
        Arrays.sort(nums);
        
        for(int i=0; i<size-2; i++)
        {
            if( (i > 0 && nums[i] != nums[i-1]) || i == 0)
            {
            int left = i+1;
            int right = size -1;
            
            int sum = 0 - nums[i];
            
            while(left < right)
            {
                if(nums[left] + nums[right] == sum)
                {
                    List<Integer> sub_ans = new ArrayList<>();
                    sub_ans.add(nums[i]);
                    sub_ans.add(nums[left]);
                    sub_ans.add(nums[right]);
                    
                    result.add(sub_ans);
                    
                    
                    while(left < right && nums[left] == nums[left + 1])
                        left++;
                    
                    while(left < right && nums[right] == nums[right - 1])
                        right--;
                    
                    left++;
                    right--;
                }
                else if(nums[left] + nums[right] > sum)
                    right--;
                
                else
                    left++;
            }
            }
        }
        return result; 
    }
}