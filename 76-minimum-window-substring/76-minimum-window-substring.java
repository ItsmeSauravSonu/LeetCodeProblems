class Solution {
    public String minWindow(String s, String t) {
     
    // Records the starting position and length of the shortest substring
    int start = 0, minLen = Integer.MAX_VALUE;
    int left = 0, right = 0;

    HashMap<Character, Integer> window = new HashMap<>();
    HashMap<Character, Integer> needs  = new HashMap<>();
    for (char c : t.toCharArray()) {
    needs.put(c,needs.getOrDefault(c,0)+1);
    }

    int match = 0;

    while (right < s.length()) {
        char c1 = s.charAt(right);
        if (needs.containsKey(c1)) {
            window.put(c1,window.getOrDefault(c1,0)+1);
            if (window.get(c1) <= needs.get(c1))
            {
                 match++;
            }
               
        }
        right++;

        while (match == t.length()) {
            if (right - left < minLen) {
                // Updates the position and length of the smallest string
                start = left;
                minLen = right - left;
            }
            char c2 = s.charAt(left);
            if (needs.containsKey(c2)) {
                int curr = window.get(c2);
                window.put(c2, curr-1);
                if (window.get(c2) < needs.get(c2))
                    match--;
            }
            left++;
        }
    }
    return minLen == Integer.MAX_VALUE ?
                "" : s.substring(start, start+minLen);
}
    }
