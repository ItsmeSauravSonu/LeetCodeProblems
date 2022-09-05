class Solution {
    public int[] findRightInterval(int[][] intervals) {
    int [] ans =new int[intervals.length];
    if(intervals.length==1){
        return  new int[]{-1};
    }
    for(int i=0;i<intervals.length;i++){
        int min =Integer.MAX_VALUE;
        int val = -1;
        for(int j=0;j<intervals.length;j++){
            if(intervals[i][1]<=intervals[j][0]&&min>intervals[j][0]){
                min = intervals[j][0];
                val = j;
            }  
        }
        ans[i] = val;
    }
    return ans;
    }
}