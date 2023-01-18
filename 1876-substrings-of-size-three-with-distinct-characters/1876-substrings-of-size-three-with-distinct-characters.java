class Solution {
    public int countGoodSubstrings(String s) {
       int n = s.length();
       int i=0, j=1, k=2,count=0;
        while(k<n){
            if(s.charAt(i)!=s.charAt(j) && s.charAt(j)!=s.charAt(k) && s.charAt(i)!=s.charAt(k))
            {
                count+=1;
            }
            i++;
            j++;
            k++;
        }
       return count;
    }
}