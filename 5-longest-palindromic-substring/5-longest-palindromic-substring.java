class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
         for(int i=0;i<s.length();i++)
         {
                 for(int j=i;j<s.length();j++)
                 {
                         String substring = s.substring(i,j+1);
                       if(substring.length()>longest.length() && isPalindrome(substring))
                       {
                               longest = substring;
                       }
                 }
         }
            return longest;
    }
        public static boolean isPalindrome(String str)
	{
		int l =0;
		int r = str.length()-1;
		
		while(l<r)
		{
			if(str.charAt(l)!=str.charAt(r)){
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}