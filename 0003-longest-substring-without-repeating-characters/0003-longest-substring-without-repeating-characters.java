class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) return s.length();
        var left = 0;
        var right = 0;
        var maxLength = 0;
        
        var map = new HashMap<Character,Integer>();
        
        while(right<s.length()){
            var ch = s.charAt(right);
            if(map.containsKey(ch)){
                maxLength = Math.max(right-left,maxLength);
                left = Math.max(left, map.get(ch)+1);
            }
            map.put(ch,right++);
        }
        
        return Math.max(maxLength, right-left);
    }
}