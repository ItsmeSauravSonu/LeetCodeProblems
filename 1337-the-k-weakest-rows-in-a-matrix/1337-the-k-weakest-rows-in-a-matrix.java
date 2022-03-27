class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans = new int[k];

		
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        if (mat.length == 0) return ans;

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
			
			
            ArrayList<Integer> temp;
            if (map.containsKey(sum)) {
                temp = map.get(sum);
            } else {
                temp = new ArrayList<>();
            }
            temp.add(i);
            map.put(sum, temp);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.addAll(map.keySet());

        int index = 0;
        while (!pq.isEmpty() && index<k){
            ArrayList<Integer> temp = map.get(pq.poll());
            for (int i = 0;i<temp.size();i++){
                ans[index++] = temp.get(i);
                if(index==k){
                    return ans;
                }
            }
        }

        return ans;
            
    }
}