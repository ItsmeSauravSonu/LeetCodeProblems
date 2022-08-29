class Solution {
    
    public boolean valid(int []piles, long mid,int h){
        long count = 0;
        for(int i=0;i<piles.length;i++){
            count += (piles[i]/mid) + (piles[i]%mid==0?0:1);
        }
        return count<=h;
    }
    
    public int max(int [] piles){
        int n = piles.length;
        long res = Long.MIN_VALUE;
        for(int x: piles){
            if(x>res){
                res = x;
            }
        }
        return (int)res;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long start = 1;
        long end  = max(piles);
        long ans = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(valid(piles, mid, h)==true){
                ans = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return (int)ans;
    }
}