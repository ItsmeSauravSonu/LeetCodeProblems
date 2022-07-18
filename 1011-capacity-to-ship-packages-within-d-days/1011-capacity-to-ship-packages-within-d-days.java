class Solution {
    public int shipWithinDays(int[] weights, int days) {
     int N =weights.length;
     int start = max(weights);
     int sum = 0;
     for(int i=0;i<N;i++)
     {
         sum+=weights[i];
     }
     int end = sum;
     
     int res = -1;
     while(start<=end)
     {
         int mid = start + (end-start)/2;
         if(isValid(weights, N, days, mid)==true)
         {
            res = mid;
            end = mid-1;
         }else{
             start=mid+1;
         }
     }
     return res;
    }
    public static boolean isValid(int [] weights, int N, int days, int mid)
    {
        int day = 1;
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum = sum +weights[i];
            if(sum>mid)
            {
                day=day+1;
                sum =weights[i];
            }
            if(day>days)
            {
                return false;
            }
        }
        return true;
    }
    public static int max(int [] arr)
    {
        int x=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>x)
            {
                x=i;
            }
        }
        return x;
    }
}