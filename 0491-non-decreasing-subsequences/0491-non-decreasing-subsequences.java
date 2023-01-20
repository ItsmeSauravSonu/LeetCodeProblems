class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        dfs(nums, 0, new ArrayList<Integer>(), res);
        return new ArrayList<>(res);
    }
    
    public void dfs(int[] nums, int start, List<Integer> cur, Set<List<Integer>> res) {
        if (cur.size() > 1) {
            res.add(new ArrayList<>(cur));
        }
        for (int i = start; i < nums.length; i++) {
            if (cur.size() == 0 || cur.get(cur.size() - 1) <= nums[i]) {
                cur.add(nums[i]);
                dfs(nums, i + 1, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
}