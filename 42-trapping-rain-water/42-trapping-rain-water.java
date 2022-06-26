class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
       int left [] = new int[n];
       int right []= new int[n];
       left[0]=arr[0];
       right[n-1]=arr[n-1];
       
       for(int i=1;i<n;i++)
       {
           left[i]=Math.max(left[i-1],arr[i]);
       }
        for(int i=n-2;i>=0;i--)
       {
           right[i]=Math.max(right[i+1],arr[i]);
       }
       int water = 0;
       for(int i=0;i<n;i++)
       {
           water+=Math.min(left[i],right[i])-arr[i];
       }
       return water;
    }
}