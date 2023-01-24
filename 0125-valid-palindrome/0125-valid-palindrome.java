class Solution {
    public boolean isPalindrome(String s) {
        // lowercase 
        s=s.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray())
        {
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String str1 = sb.toString();
        String str2 = sb.reverse().toString();
        System.out.println(str1);
        if(str1.equals(str2)) return true;
        return false;
    }
}