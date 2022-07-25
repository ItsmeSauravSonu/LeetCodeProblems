class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> list = new ArrayList<>(); // for final result
        list.add(S); // first add original string
        backtrack(S, list, 0);//backtrack, start from the first character of the string
        return list;// return final result
    }
    public void backtrack(String S, List<String> list, int start) {
        if (start == S.length()) {// if we reach the tail of the string, just return
            return ;
        }
        for (int i = start; i < S.length(); i++) {// we start from the first character of the string
            char c = S.charAt(i); // keep this character for checking later
            if (Character.isDigit(c)) {//if it is a digit, continue
                continue;
            }
            StringBuilder sb = new StringBuilder(S);// the reason for using StringBuilder is that we can use the function setCharAt()
            if (Character.isUpperCase(c)) {// change uppercase to lowercase or change lower case to upper case
                sb.setCharAt(i, Character.toLowerCase(c));
            } else {
                sb.setCharAt(i, Character.toUpperCase(c));
            }
            list.add(sb.toString()); // add this modified string to result
            backtrack(sb.toString(), list, i + 1);//based on the modified string, keep search
			//after the funtion backtrack(), we don't change this character at the index i, use the original string, go to next loop, at index i + 1
        }
    }
}