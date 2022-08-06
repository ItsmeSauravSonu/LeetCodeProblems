class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
      int res = 0;
     for(int i = 0; i < arr.length; i++){
         int sum = 0;
         for(int j = i; j < arr.length; j++){
            sum += arr[j];
            if(i == j) res += sum;
            else if((j-i)%2 == 0){
                 res += sum;
             }
         }
     }  
        return res;
    }
}