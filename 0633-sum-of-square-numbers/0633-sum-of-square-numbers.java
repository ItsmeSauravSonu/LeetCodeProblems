class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            long curr = left * left + right * right;
            if (curr == c) {
                return true;
            } else if (curr < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}