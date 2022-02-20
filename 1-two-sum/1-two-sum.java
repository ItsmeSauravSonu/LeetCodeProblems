class Solution {
    public int[] twoSum(int[] array, int targetSum) {
        for(int i=0;i<array.length;i++)
        {
                for(int j=i+1;j<array.length;j++)
                {
                        int currSum = array[i]+array[j];
                        if(currSum==targetSum)
                        {
                                int [] ans = {i,j};
                                return ans;
                        }
                }
        }
         
            return new int[0];
    }
}