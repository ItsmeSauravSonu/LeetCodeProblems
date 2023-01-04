class Solution {
    public int minimumRounds(int[] tasks) {
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int x: tasks){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        for(Map.Entry entry : map.entrySet()){
            int val = (int) entry.getValue();
            if(val==1) return -1;
            if(val>=3){
                ans += val/3;
                if(val%3!=0){
                    ans+=1;
                }
            }else if(val==2){
                ans+=1;
            }
        }
        return ans;
    }
}



