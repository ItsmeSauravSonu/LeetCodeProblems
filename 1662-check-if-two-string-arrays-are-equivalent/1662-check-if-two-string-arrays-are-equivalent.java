class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String str1 = "";
       for(String x: word1){
           str1+=x;
       }
       String str2 = "";
       for(String y:word2){
           str2+=y;
       }
        if(str1.equals(str2)) return true;
        return false;
    }
}