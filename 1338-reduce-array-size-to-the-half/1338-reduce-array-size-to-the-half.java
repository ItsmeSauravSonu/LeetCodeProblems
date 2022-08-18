class Solution {
    // n = 10 half = 5
    // 3 - 4
    // 5 - 3
    // 2 - 2
    // 7 - 1    
    
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int half = n/2;
        int count = 0;
        //making the map count the occurences of the number
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        for(int x: list){
            if(n<=half){
                return count;
            }
            n=n-x;
            count++;
        }
        return count;
    }
}