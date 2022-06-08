class Solution {
    public int search(int[] array, int target) {
       int left = 0;
  int right = array.length-1;

    while(left<=right)
      {
        int mid = left + (right-left)/2;
        int potentialMatch = array[mid];
        int leftNum = array[left];
        int rightNum = array[right];

        if(target == potentialMatch){
          return mid;
        }else if(leftNum <= potentialMatch)
        {
          if(target<potentialMatch && target >= leftNum)
          {
            right = mid-1;
          }else{
            left = mid+1;
          }
        }else{
          if(target>potentialMatch && target<=rightNum){
            left = mid+1;
          }else{
            right = mid-1;
          }
        }
      }
    return -1; 
    }
}