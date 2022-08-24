class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int k,j;
        for(k=nums.size()-2 ; k>=0 ; k--){               //O(n)          
            if(nums[k]<nums[k+1])                   
                break;
        }
        if(k<0){
            reverse(nums.begin(),nums.end());           
        }
        else{
            for(j=nums.size()-1 ; j>k ; j--){           //O(n)
                if(nums[j]>nums[k])
                    break;
            }
            swap(nums[k],nums[j]);                      //O(1)
            reverse(nums.begin()+k+1,nums.end());       //O(n)
    }
    }
};