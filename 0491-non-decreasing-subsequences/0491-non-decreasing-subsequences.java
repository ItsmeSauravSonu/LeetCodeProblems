class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<>(); // create a set to store the unique non-decreasing subsequences
        dfs(nums, 0, new ArrayList<Integer>(), res); // start the dfs algorithm with the input array, starting index 0 and the res set
        return new ArrayList<>(res); // return the res set as a list
    }
    
    public void dfs(int[] nums, int start, List<Integer> cur, Set<List<Integer>> res) {
        if (cur.size() >= 2) { // if the current list has at least 2 elements 
            res.add(new ArrayList<>(cur)); // it means it's a non-decreasing subsequence and it is added to the res set
        }
        for (int i = start; i < nums.length; i++) {
            if (cur.size() == 0 || cur.get(cur.size() - 1) <= nums[i]) { // if the current list is empty or the last element in the cur list is less than or equal to the current element in the array
                cur.add(nums[i]); // the current element can be added to the cur list and still maintain a non-decreasing order
                dfs(nums, i + 1, cur, res); // recursive call with the updated cur list, current index +1 and the res set
                cur.remove(cur.size() - 1); // backtracking by removing the last element from the cur list
            }
        }
    }
}