class Solution {
    public int maximumCandies(int[] arr, long k) {
       int count = 0;
       int low = 1;
        int high = 10000001;
            
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
    
}