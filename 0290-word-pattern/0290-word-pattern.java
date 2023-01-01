class Solution {
    public boolean wordPattern(String pattern, String s) {
         String words [] = s.split(" ");
         if(pattern.length()!=words.length) return false;
        
    HashMap<Character,String> map  = new HashMap<>();
    HashSet<String> set = new HashSet<>();
    for(int i =0 ;i<pattern.length();i++){
        char ch = pattern.charAt(i);
		// Case when same key is assign with different words
        if(map.containsKey(ch) && !map.get(ch).equals(words[i])){
            return false;
        }
		// Case when same value is assigned to different keys 
		else if(!map.containsKey(ch) && set.contains(words[i])){
            return false ;
        }else{
            map.put(ch,words[i]);
            set.add(words[i]);
        }
    }
    return true ;
    }
}