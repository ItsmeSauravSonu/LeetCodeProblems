class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
     Arrays.sort(special);
        int ans=0,pre=bottom-1,n=special.length;
        for(int i:special){
            ans = Math.max(ans,i-pre-1);
            pre = i;
        }
        ans = Math.max(ans,top-special[n-1]);
        return ans;

    }
}