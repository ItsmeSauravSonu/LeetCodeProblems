class Solution {
    public int numSquares(int n) {
        int [] T = new int[n+1];
        for (int i = 0; i <= n; i++)
        {
            // initialize T[i] with the maximum number of squares possible
            T[i] = i;
 
            // loop through all positive integers less than or equal to the
            // square root of `i`
            for (int j = 1; j*j <= i; j++)
            {
                // calculate the value of T[i] using the result of a smaller
                // subproblem T[i-j×j]
                T[i] = Integer.min(T[i], 1 + T[i - j*j]);
            }
        }
 
        return T[n];
    }
}