class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if (str2.length() == 0) {
            return str1;
        }
        // str1 should starts with str2
        if (!str1.substring(0, str2.length()).equals(str2)) {
            return "";
        }
        return gcdOfStrings(str1.substring(str2.length()), str2);   
    }
}