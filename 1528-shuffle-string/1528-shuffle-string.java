class Solution {
    public String restoreString(String s, int[] indices) {
        
        int n = s.length(); //length of the string
        char [] ch = s.toCharArray(); 
        
        char [] ans = new char[n];
        for(int i=0;i<n;i++){
           ans[indices[i]]=ch[i];
        }
        return String.valueOf(ans);
    }
}