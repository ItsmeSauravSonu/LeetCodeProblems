class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int cnt =0;
        for(int x: nums)
        {
            if(x!=cnt){
                return cnt;
            }
            cnt++;
        }
        return cnt;
    }
}