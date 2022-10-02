class Solution {
    private int mod = (int) Math.pow(10, 9) + 7;
    private int numRollsToTarget(int n, int k, int target, int[][] mem) {
  	if (target == 0 && n == 0)
  		return 1;
  	if (target < 0 || n == 0)
  		return 0;
  	if (mem[n][target] != -1)
  		return mem[n][target];
  	int count = 0;
  	for (int i = 1; i <= k; i++) {
  		count = (count + numRollsToTarget(n - 1, k, target - i, mem) % mod) % mod;
  	}
  	return mem[n][target] = count;
  }
  public int numRollsToTarget(int n, int k, int target) {
  	int[][] mem = new int[n + 1][target + 1];
  	for (int[] a : mem)
  		Arrays.fill(a, -1);	//fill all values in the 2-D matrix with -1 because count cannot be -1.
  	return numRollsToTarget(n, k, target, mem);
  }

 
}