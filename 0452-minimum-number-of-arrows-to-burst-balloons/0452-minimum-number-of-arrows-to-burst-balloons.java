class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int arrows = 1;
        int[] prev = points[0];
        
        for(int i=1;i<points.length;i++){
            int prevStart = prev[0];
            int prevEnd = prev[1];
            int newStart = points[i][0];
            int newEnd = points[i][1];

            if(newStart <= prevEnd){
                prev[0] = newStart;
                prev[1] = Math.min(prevEnd,newEnd);
            }else{
                prev[0] = newStart;
                prev[1] = newEnd;
                arrows++;
            }
        }

        return arrows;
    }
}