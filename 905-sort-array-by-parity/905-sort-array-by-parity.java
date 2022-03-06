class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length-1;
            
            while(start<end)
            {
                    if(nums[start]%2==0){
                            start++;
                    }
                    else{
                            if(nums[end]%2!=0){
                                    end--;
                            }
                            if(nums[end]%2==0){
                                    
                                  swap(nums, start, end);
                                    start++;
                                    end--;
                            }
                    }
            }
            System.out.println(Arrays.toString(nums));
            return nums;
    }
     private void swap(int []nums,int start, int end){
             int temp = nums[start];
             nums[start]=nums[end];
             nums[end]=temp;
     }  
}