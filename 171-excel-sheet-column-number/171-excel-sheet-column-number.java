class Solution {
    public int titleToNumber(String str) {
        int count = str.charAt(0)-'A'+1;
        for(int i = 1; i<str.length(); i++){
            char ch = str.charAt(i);
            int val = ch-'A'+1;
            count *= 26;
            count += val;
        }
        return count;
    }
}