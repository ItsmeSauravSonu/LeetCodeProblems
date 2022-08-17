class Solution {
    String [] pattern = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
        
        HashSet<String> set = new HashSet<>();
        for(String w: words){
            set.add(getCode(w));
        }
        return set.size();
    }
    public String getCode(String w){
        StringBuilder sb = new StringBuilder();
        for(char c: w.toCharArray()){
            sb.append(pattern[c-'a']);
        }
        return sb.toString();
    }
}