class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
    Arrays.sort(nums);
    backtrack(0, new ArrayList<>(), nums);
    return res;
    }
    public void backtrack(int start, List<Integer> sub, int [] nums)
    {
        res.add(new ArrayList(sub));
        for(int i=start;i<nums.length;i++)
        {
            sub.add(nums[i]);
            backtrack(i+1,sub,nums);
            sub.remove(sub.size()-1);
        }
    }
}