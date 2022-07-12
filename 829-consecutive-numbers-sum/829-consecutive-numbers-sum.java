class Solution {
    public int consecutiveNumbersSum(int N) {
       int ans=0;
        
        for(int k=1;k*k<2*N;k++){
            
            if((N-k*(k-1)/2)%k==0) ans++;
        }
        return ans; 
    }
}