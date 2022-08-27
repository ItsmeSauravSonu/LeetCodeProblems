class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        
        for(int [] i1: items1){
            int x = i1[0];
            int y = i1[1];
            
            map1.put(x,y);
        }
        //System.out.println(map1);
        
        for(int []i2: items2){
            int p = i2[0];
            int q = i2[1];
            
            if(map1.containsKey(p)){
                map1.put(p, map1.getOrDefault(p,map1.get(p))+q);
            }else{
                map1.put(p,q);
            }
        }
        
        // System.out.println(map1);
        for(Map.Entry<Integer,Integer> e: map1.entrySet()){
            int first = e.getKey();
            int second = e.getValue();
            List<Integer> curr = new ArrayList<>();
            curr.add(first);
            curr.add(second);
            list.add(curr);
        }
        return list;
        
    }
}