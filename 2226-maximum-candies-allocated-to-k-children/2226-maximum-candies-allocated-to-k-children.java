class Solution {
    public int maximumCandies(int[] arr, long k) {
       int count = 0;
       int low = 1;
        int high = max(arr);
            
        while(low<=high){
                int mid = low + ((high-low)>>1);
                if(distribute(arr,mid,k)==true){
                        count = mid;
                        low = mid+1;
                }else {
                        high = mid-1;
                }
        }
            return count;
    }
        public boolean distribute(int [] arr, int x, long k){
                long count = 0;
                for(int i: arr)
                {
                  count+=(i/x);      
                }
                return count>=k;
        }
        public int max(int []arr){
                int maxm = Integer.MIN_VALUE;
                for(int i: arr){
                        maxm = Math.max(maxm,i);
                }
                return maxm;
        }
    
}