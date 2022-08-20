class Solution {
    public int[] shuffle(int[] nums, int n) {
      int [] ans = new int[2*n];
        int j = 0,i=0;
      for(int k=0;k<n*2;){
          int x = nums[i];
          int y = nums[j+n];
          ans[k]=x;
          ans[k+1]=y;
          k+=2;
          i++;
          j++;
          
      }
        return ans;
    }
}