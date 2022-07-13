class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i!=0){
                l1.add(nums[i]);
            }
        }
         for(int i=0;i<n;i++)
        {
            if(i!=n-1){
                l2.add(nums[i]);
            }
        }
        return Math.max(solve(l1),solve(l2));
    }
     public int solve(List<Integer> arr) {
        int n = arr.size();
    int prev = arr.get(0);
    int prev2 =0;
    
    for(int i=1; i<n; i++){
        int pick = arr.get(i);
        if(i>1)
            pick += prev2;
        int nonPick = 0 + prev;
        
        int cur_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev= cur_i;
        
    }
    return prev;
    }
}