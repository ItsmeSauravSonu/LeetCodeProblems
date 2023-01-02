class Solution {
    public boolean detectCapitalUse(String word) {
        //1.all upper case
        int n = word.length();
        if(n==1) return true;
        boolean ans = false;
        char ch = word.charAt(0);
        int countUpper = 0, countLower = 0;
        if(Character.isUpperCase(ch)){
            for(int i=1;i<n;++i){
                if(Character.isUpperCase(word.charAt(i))){
                    countUpper++;
                }else{
                    countLower++;
                }
            }
            if(countUpper==n-1 || countLower==n-1){
                ans = true;
            }
        }else{
             for(int i=1;i<n;++i){
                if(Character.isUpperCase(word.charAt(i))){
                    countUpper++;
                }else{
                    countLower++;
                }
                 if(countLower==n-1){
                     ans = true;
                 }
        }
        
        //2.all lower case
        //3. first letter uppercase, rest is lowercase
       
    }
         return ans;
}
}