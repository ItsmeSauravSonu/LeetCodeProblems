class Solution {
    public int maximumProduct(int[] nums) {
       Arrays.sort(nums);
       int withNegProduct = (nums[0]*nums[1])*nums[nums.length-1];
       int withPosProduct = (nums[nums.length-1]*nums[nums.length-2])*nums[nums.length-3];
        
       int res = Math.max(withNegProduct, withPosProduct);
        return res;
    }
}