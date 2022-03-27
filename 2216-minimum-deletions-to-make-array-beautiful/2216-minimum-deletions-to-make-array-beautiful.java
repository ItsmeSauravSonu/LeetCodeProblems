class Solution {
    public int minDeletion(int[] nums) {
        int ans = 0;
        int cur = 0;
        int last = -1;
        for (int x : nums) {
            if (x == last && cur % 2 == 1) {
                ans++;
            } else {
                cur++;
                last = x;
            }
        }
        if (cur % 2 == 1) {
            ans++;
        }
        return ans;
    }
}