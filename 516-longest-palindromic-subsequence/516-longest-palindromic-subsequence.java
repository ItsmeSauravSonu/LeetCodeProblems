class Solution {
     
    public int longestPalindromeSubseq(String X) {
        Map<String,Integer> lookup = new HashMap<>();
        return findLongestPalindrome(X,0,X.length()-1,lookup);
    }
    public static int findLongestPalindrome(String X, int i, int j,
                                        Map<String, Integer> lookup)
    {
        // Base condition
        if (i > j) {
            return 0;
        }
 
        // If the string `X` has only one character, it is a palindrome
        if (i == j) {
            return 1;
        }
 
        // Construct a unique map key from dynamic elements of the input
        String key = i + "|" + j;
 
        // If the subproblem is seen for the first time, solve it and
        // store its result in a map
        if (!lookup.containsKey(key))
        {
            /* If the last character of the string is the same as the first character,
               include the first and last characters in palindrome and recur
               for the remaining substring `X[i+1, j-1]` */
 
            if (X.charAt(i) == X.charAt(j)) {
                lookup.put(key, findLongestPalindrome(X, i + 1, j - 1, lookup) + 2);
            }
            else {
 
                /* If the last character of the string is different from the first
                    character
 
                    1. Remove the last character and recur for the remaining substring
                       `X[i, j-1]`
                    2. Remove the first character and recur for the remaining substring
                       `X[i+1, j]`
                    3. Return the maximum of the two values */
 
                lookup.put(key, Integer.max(findLongestPalindrome(X, i, j - 1, lookup),
                                            findLongestPalindrome(X, i + 1, j, lookup)));
            }
        }
 
        // Return the subproblem solution from the map
        return lookup.get(key);
    }
}