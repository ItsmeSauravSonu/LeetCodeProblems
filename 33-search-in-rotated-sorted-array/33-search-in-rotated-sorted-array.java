class Solution {
    public int search(int[] nums, int target) {
        int st=0,mid=0,next=0,prev=0,n=nums.length,end=n-1,x=n-1;
        while(st<=end){
            mid=st+(end-st)/2;
            next=(mid+1)%n;
            prev=(mid+n-1)%n;
            if(nums[mid]<nums[next]&&nums[mid]<nums[prev])
            {x=mid;
             break;
            }
            else if(nums[0]<=nums[mid]){
                st=mid+1;
            }
            else if(nums[mid]<=nums[nums.length-1])
                end=mid-1;
        }
         st=0;end=x-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target){
                end=mid-1;
            }
            else st=mid+1;
        }
        st=x;end=n-1;
        while(st<=end){
            mid=st+(end-st)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]>target){
                end=mid-1;
            }
            else st=mid+1;
        }
        return -1;
    }
}