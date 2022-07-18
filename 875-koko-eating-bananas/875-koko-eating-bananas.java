class Solution {
    public boolean canEat(int[] piles, long mid, int h){
        long hours=0;
        for(int pile:piles)
            hours += (pile/mid)+ (pile%mid == 0 ? 0 : 1);
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long start =1, end = Arrays.stream(piles).max().getAsInt();
        long ans =0;
        while(start <= end){
            long mid = start +((end-start)/2);
            if(canEat(piles,mid,h)){
                ans = mid;
                end = mid-1;
            }else start = mid+1;
        }
        return (int)ans;
}
}