class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
    
        HashSet<Integer> set = new HashSet<>(map.values());
        if(set.size()!=list.size()) return false;
        return true;
    }
}