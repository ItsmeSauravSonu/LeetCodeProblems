class Solution {
    public int lengthOfLongestSubstring(String s) {
      int slow = 0, fast = 0;
		HashSet<Character> set = new HashSet<>();
		int longest = 0;
		while(fast < s.length() && slow <= fast) {
			if(set.contains(s.charAt(fast))) {
				set.remove(s.charAt(slow));
				slow++;
			}else {
				set.add(s.charAt(fast));
				fast ++;
			}
			longest = Math.max(longest, set.size());
		}
		return longest; 
    }
}