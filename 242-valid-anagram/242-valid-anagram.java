class Solution {
    public boolean isAnagram(String s0, String s1) {
       HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:s0.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        HashMap<Character,Integer> map1=new HashMap<>();
        for(char ch:s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }

       if(map1.equals(map)){
               return true;
       } 
            return false;
}
}