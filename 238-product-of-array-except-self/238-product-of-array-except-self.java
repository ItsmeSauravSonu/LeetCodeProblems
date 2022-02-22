class Solution {
    public int[] productExceptSelf(int[] nums) {
          int length = nums.length;
          int [] productArray = new int[length];
           
           int mul=1;
            
            for(int i=0;i<length;i++)
            {
                    productArray[i]=mul;
                    mul*=nums[i];
            }
            int rightMul=1;
            for(int i=length-1;i>=0;i--)
            {
                    productArray[i]*=rightMul;
                    rightMul*=nums[i];
            }
            return productArray;
    }
}