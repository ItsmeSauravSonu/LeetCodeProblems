class Solution {
    public int f(String s, int i, int[] dp) {
	int n = s.length();
	if (i == n)
		return 1;
	if (s.charAt(i) == '0')
		return 0;
	if (dp[i] != -1)//if this sub-problem has already been solved, don't go and invoke another series of recursive call. Get the result from cache
		return dp[i];
	int count = f(s, i + 1, dp);
	if (i < n - 1 && ((s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0')) < 27) {
		count += f(s, i + 2, dp);
	}
		return dp[i] = count;//store result for each sub-problem
}
    
public int numDecodings(String s) {
    int n = s.length();
	int[] dp = new int[n];
	Arrays.fill(dp, -1);
	return f(s, 0, dp);
}
}