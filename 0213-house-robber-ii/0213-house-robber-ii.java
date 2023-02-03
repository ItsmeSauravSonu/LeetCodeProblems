class Solution {
    public int rob(int[] nums) {
    int n=nums.length;
		if(n==2) return Math.max(nums[0],nums[1]);
		if(n==1) return nums[0];

		// can choose rob first, but don't rob last
		int[] dp1 = new int[nums.length];
		dp1[0] = nums[0];
		dp1[1] = nums[1];
		dp1[2] = nums[2]+nums[0];
		for(int i=3;i<n-1;i++){
			dp1[i]=nums[i]+Math.max(dp1[i-2],dp1[i-3]);
		}

		//cannot choose rob first, but can choose rob last
		int[] dp2 = new int[nums.length];
		dp2[1] = nums[1];
		dp2[2] = nums[2];
		for(int i=3;i<n;i++){
			dp2[i]=nums[i]+Math.max(dp2[i-2],dp2[i-3]);
		}

		return Math.max(Math.max(dp1[n-2],dp1[n-3]),Math.max(dp2[n-1],dp2[n-2]));
        
    }}      
