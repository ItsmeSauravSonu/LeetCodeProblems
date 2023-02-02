class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n = order.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(order.charAt(i), i);
        }
        for( int i=1; i<words.length; i++ ){
            
            // Checking every character of the adjacent pair
            int j=0;
            while( j < words[i-1].length() && j < words[i].length() ){
                if( map.get(words[i].charAt(j)) < map.get(words[i-1].charAt(j)) ) return false;
                else if( map.get(words[i].charAt(j)) > map.get(words[i-1].charAt(j)) ) break;
                else{
                    j++;
                }
            }
            if( j == words[i-1].length() || j == words[i].length() ){
                if( words[i-1].length() > words[i].length() ) return false;
            }

        }
        return true;
        
    }
}