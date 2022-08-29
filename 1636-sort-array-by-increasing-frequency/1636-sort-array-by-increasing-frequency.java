class Solution {
     class pair{
        int first;
        int second;
       public pair(int first, int second){
            this.first = first;
            this.second = second;
        }
        pair(){
            
        }
    }
    public int[] frequencySort(int[] nums) {
    int [] ans = new int[nums.length];
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int x: nums){
        map.put(x, map.getOrDefault(x,0)+1);
    }
    ArrayList<pair> list = new ArrayList<>();
    for(int x: map.keySet()){
        list.add(new pair(x, map.get(x)));
    }
    Collections.sort(list, (a,b)->{
        if(a.second == b.second) return a.first-b.first;
        else return b.second-a.second;
    });
    int k=nums.length-1;    
    for(int i=0;i<list.size();i++){
            while(list.get(i).second>0){
                // System.out.print(list.get(i).first+" ");
                ans[k--]=list.get(i).first;
                list.get(i).second--;
            }
        }
        
        return ans;
    }
}

/* if(p1.second==p2.second)
        return p1.first>p2.first;
    return p1.second<p2.second;*/