class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            {
                countZero++;
            }else if(nums[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }
        
        countOne +=countZero;
         countTwo+=countOne;
    for(int i=0;i<nums.length;i++){
        
        if(i<countZero){ nums[i] = 0;}else
        if(i<countOne){nums[i] =1;}else 
        if(i<countTwo){nums[i] =2;}  
        
    }
        
       
    }
}