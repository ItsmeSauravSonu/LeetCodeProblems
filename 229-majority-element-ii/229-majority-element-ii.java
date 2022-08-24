class Solution {
    public List<Integer> majorityElement(int[] a) {
        int size = a.length;
        int half = size/3;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<size;i++){
           
           map.put(a[i], map.getOrDefault(a[i],0)+1); 
            if(map.get(a[i])>half){
                if(!list.contains(a[i])){
                    list.add(a[i]);
                }
            }
        }
        return list;
    }
}