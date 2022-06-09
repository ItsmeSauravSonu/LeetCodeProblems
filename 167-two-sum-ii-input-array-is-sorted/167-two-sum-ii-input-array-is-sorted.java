class Solution {
    public int[] twoSum(int[] numbers, int target) {
      Map<Integer, Integer> map = new HashMap<>();
    int[] ret = new int[2];
    for (int i = 0; i < numbers.length; i++) {
        if (map.containsKey(target-numbers[i])) {
            ret[0] = map.get(target-numbers[i]) + 1;
            ret[1] = i+1;
            break;
        }
        map.put(numbers[i], i);
    }
    return ret;  
    }
}