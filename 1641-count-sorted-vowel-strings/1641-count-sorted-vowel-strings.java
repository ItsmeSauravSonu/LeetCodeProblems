class Solution {
    public int count(int idx, int n, String vowels){
        if(n==0) return 1;
        if(idx>=5) return 0;
        
        int pick = count(idx,n-1, vowels);
        int notPick = count(idx+1, n,vowels);
        
        return pick + notPick;
    }
    public int countVowelStrings(int n) {
      String vowels = "aeiou";
      return count(0,n,vowels);
    }
}