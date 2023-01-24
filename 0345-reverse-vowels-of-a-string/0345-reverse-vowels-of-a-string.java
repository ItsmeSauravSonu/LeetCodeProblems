class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        if(n==0 || n==1 || s==null) return s;
        char [] ch = s.toCharArray();
        //StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        int left = 0, right = n-1;
        
        while(left<right){
            while(left<right && !vowels.contains(ch[left]+"")){
                left++;
            }
             while(left<right && !vowels.contains(ch[right]+"")){
                right--;
            }
            char temp = ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            
            left++;
            right--;
            
        }
        return String.valueOf(ch);
    }
}