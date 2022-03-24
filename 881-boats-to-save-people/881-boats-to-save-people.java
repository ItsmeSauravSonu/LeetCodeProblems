class Solution {
    public int numRescueBoats(int[] people, int limit) {
       Arrays.sort(people);
       int count = 0;
       int left = 0;
       int right = people.length-1;
            
       if(people.length==0) return 0;
       if(people.length==1) return 1;
            
        while(left<right)
        {
                if(people[left]+people[right]<=limit)
                {
                        count++;
                        left++;
                        right--;
                }else if(people[left]+people[right]>limit)
                {
                        count++;
                        right--;
                }
        }
            if(left==right)
            {
                    count++;
            }
      return count;
    }
}