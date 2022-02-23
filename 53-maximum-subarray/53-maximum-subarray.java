class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
            
            for(int x: nums)
            {
                    maxEndingHere = Math.max(maxEndingHere+x, x);
                    maxSoFar = Math.max(maxEndingHere,maxSoFar);
            }
            return maxSoFar;
    }
}