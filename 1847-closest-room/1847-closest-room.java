class Solution {
   
         public int[] closestRoom(int[][] rooms, int[][] queries) {
        Arrays.sort(rooms,new Pair());
        int[] ans=new int[queries.length];
        
        for(int i=0;i<ans.length;i++){
            int size=queries[i][1];
            int p=queries[i][0];
            
            int start=binarySearch(rooms,size);
            if(start==-1){
                ans[i]=-1;
                continue;
            }
            
            int index=find(rooms,start,p);
            ans[i]=rooms[index][0];
        }
        return ans;
    }
    
    private int find(int[][] rooms,int start,int p){
        int ans=start;
        int min=Math.abs(rooms[start][0]-p);
        for(int i=start+1;i<rooms.length;i++){
            int diff=Math.abs(rooms[i][0]-p);
            if(diff<min){
                min=diff;
                ans=i;
            }else if(diff==min){
                if(rooms[i][0]<rooms[ans][0]){
                    ans=i;
                }
            }
        }
        return ans;
    }
    
    private int binarySearch(int[][] rooms,int size){
        int lo=0 , hi=rooms.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo + (hi-lo)/2;
            
            if(rooms[mid][1]<size){
                lo=mid+1;
            }else{
                ans=mid;
                hi=mid-1;
            }
        }
        return ans;
    }
    
    public class Pair implements Comparator<int[]>{
        public int compare(int[] one,int[] two){
            return one[1]-two[1];
        }
    }
}