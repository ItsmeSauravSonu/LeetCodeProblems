class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int val : nums) set.add(val);
        for(int i = 1 ; i < nums.length - 1 ; i++){
            if(set.contains(nums[i]-diff) && set.contains(nums[i]+diff)) count++;
        }
        return count;
    }
}