class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if (i>0 && nums[i] == nums[i - 1]) {
				continue;
			}
            int left = i+1;
            int right = n-1;
            int target = -nums[i];
            while(left<right)
            {
                if(nums[left]+nums[right]==target){
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }else if(nums[left]+nums[right]<target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}
