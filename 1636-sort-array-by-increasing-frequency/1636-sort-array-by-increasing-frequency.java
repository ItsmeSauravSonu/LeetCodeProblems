class Solution {
    public int[] frequencySort(int[] nums) {
         int n = nums.length;
         HashMap<Integer,Integer> hs=new HashMap<>();
         for(int x: nums) hs.put(x,hs.getOrDefault(x,0)+1);
         HashMap<Integer,List<Integer>> hs1=new HashMap<>();
        for(Map.Entry e: hs.entrySet()){
            int k=(int)e.getKey();
            int v=(int)e.getValue();
            if(hs1.containsKey(v)){
                List<Integer> l=hs1.get(v);
                for(int j=0;j<v;j++)
                    l.add(k);
                hs1.put(v,l);
            }
            else{
                List<Integer> l=new ArrayList<>();
                for(int j=0;j<v;j++)
                    l.add(k);
                hs1.put(v,l);
            }
        }
        List<Integer> list = new ArrayList<>(hs1.keySet());
        Collections.sort(list);
        int k=0;
        for(int i=0;i<list.size();i++){
            List<Integer> l=hs1.get(list.get(i));
            Collections.sort(l);
            Collections.reverse(l);
            for(int j=0;j<l.size();j++){
                nums[k]=l.get(j);
                k++;
            }
        }
        return nums;
    }
    
}