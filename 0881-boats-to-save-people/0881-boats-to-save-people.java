class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0, right = people.length-1;
        int count = 0;
        while(left<=right){
           count++;
           if(people[left]+people[right]<=limit){
               left++;
           }
            right--;
        }
        return count;
    }
}