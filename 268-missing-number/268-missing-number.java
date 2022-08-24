class Solution {
    public int missingNumber(int[] nums) {
        int ans = -1;
        int [] count = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==0){
                ans = i;
                break;
            }
        }
        return ans;
    }
}