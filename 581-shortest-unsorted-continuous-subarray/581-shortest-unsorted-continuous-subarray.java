class Solution {
    public int findUnsortedSubarray(int[] nums) {
      int n = nums.length;
        int max = nums[0];
        int min = nums[n-1];

		// These values are chosen to handle the edge cases. For unsorted arrays these values will be updated inside the loop
        int end = 0, start = 1;
		
        for(int i=0, j=n-1; i < n; i++, j--){
            if(nums[i] < max)
                end = i;
            if(nums[j] > min)
                start = j;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[j]);
        }
        return end - start + 1;
    }
}