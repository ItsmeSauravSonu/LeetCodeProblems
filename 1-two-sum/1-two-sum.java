class Solution {
    public int[] twoSum(int[] array, int targetSum) {
           int n = array.length;
            int [] ans = new int[2];
          for(int i=0;i<n;i++)
          {
                  int first = array[i];
                  for(int j=i+1;j<n;j++)
                  {
                          int second = array[j];
                          
                          int sum = first+second;
                          if(sum==targetSum)
                          {
                              ans[0]=i;
                              ans[1]=j;
                          }
                  }
          }
            return ans;
    }
}