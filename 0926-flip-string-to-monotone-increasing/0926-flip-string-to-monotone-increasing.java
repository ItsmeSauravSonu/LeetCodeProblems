class Solution {
    public int minFlipsMonoIncr(String s) {
        int res = 0;
        int countONE = 0;
        
        for(char c: s.toCharArray()){
            if(c=='1'){
                countONE++;
            }else{
                res++;
                res = Math.min(res, countONE);
            }
        }
        return res;
    }
}