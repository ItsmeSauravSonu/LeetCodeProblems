class Solution {
    // n = 10 half = 5
    // 3 - 4
    // 5 - 3
    // 2 - 2
    // 7 - 1    
    
    public int minSetSize(int[] arr) {
//         int l = arr.length;
//         HashMap<Integer,Integer> hs=new HashMap<>();
//         for(int x: arr) hs.put(x,hs.getOrDefault(x,0)+1);
//         int dp[]=new int[hs.size()];
//         int i=0;
//         for(Map.Entry e: hs.entrySet()){
//             int v=(int)e.getValue();
//             dp[i]=v;
//             i++;
//         }
//         Arrays.sort(dp);
//         int t=l/2;
//         int c=0;
//         i=dp.length-1;
//         while(i>=0 &&  t>0){
//             t-=dp[i];
//             i--;
//             c++;
            
//         }
//         return c;
        
        int l = arr.length;
        HashMap<Integer,Integer> hs=new HashMap<>();
        for(int x: arr) hs.put(x,hs.getOrDefault(x,0)+1);
        int i=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(Map.Entry e: hs.entrySet()){
            int v=(int)e.getValue();
            min=Math.min(min,v);
            max=Math.max(max,v); 
        }
        int dp[]=new int[max-min+1];
        for(Map.Entry e: hs.entrySet()){
            int v=(int)e.getValue();
            dp[v-min]+=1;
        }
        int c=0;
        int t=l/2;
        for(i=dp.length-1;i>=0;i--){
            if(dp[i]>0){
                while(t>0 && dp[i]>0){
                    t-=(i+min);
                    dp[i]-=1;
                    c++;
                }
            }
        }
        return c;
    }
}