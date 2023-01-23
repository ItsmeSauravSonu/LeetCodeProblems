class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int [] ans = new int[2];
       int n = numbers.length;
       int left = 0;
       int right = n-1;
       while(left<right){
           if(numbers[left]+numbers[right]==target)
           {
              
               // left++;
               // right--;
               return new int[]{left+1, right+1};
           }else if(numbers[left]+numbers[right]<target){
               left++;
           }else{
               right--;
           }
       }
        return new int[]{};
    }
}