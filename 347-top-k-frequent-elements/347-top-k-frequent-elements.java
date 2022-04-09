class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: nums)
        {
                map.put(x,map.getOrDefault(x,0)+1);
        }
        //System.out.println(map);
       TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for(int num : map.keySet()){
           int freq = map.get(num);
           if(!freqMap.containsKey(freq)){
               freqMap.put(freq, new LinkedList<>());
           }
           freqMap.get(freq).add(num);
        }
        
        List<Integer> res = new ArrayList<>();
        while(res.size()<k){
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        int [] ans = new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
                ans[i]=res.get(i);
        }
            return ans;
    }
}