class Solution {
    public int minDays(int[] b, int m, int k) {
        int n = b.length;
        if(n<m*k) return -1;
        int start = 1, end = Integer.MIN_VALUE;
        for(int i: b)
        {
            if(i>=end)
            {
              end = i;  
            }
        }
        int res = -1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(isValid(b, m, k, mid)==true)
            {
                res = mid;
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return res;
    }
    public boolean isValid(int [] bloomDay, int m , int k, int days)
    {
        int len = bloomDay.length, count = 0, adjacent = 0;
	for (int i = 0; i < len; i++) {

		if (bloomDay[i] <= days) {
			adjacent++;
			if (adjacent == k) {
				count++;
				if (count == m)
					return true;
				adjacent = 0;
			}
		} else
			adjacent = 0;
	}
	return false;   
    }
}