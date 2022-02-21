class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
int result = 0;
for(int num : nums){
hashMap.put(num, hashMap.getOrDefault(num,0)+1);
if(hashMap.get(num) > nums.length/2){
result = num;
break;
}
}
return result;
    }
}