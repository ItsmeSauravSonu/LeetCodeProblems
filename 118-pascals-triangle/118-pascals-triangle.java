class Solution {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    if (numRows == 0) return result;

    result.add(new ArrayList<>(Arrays.asList(1))); // seed first row

    for (int i = 1; i < numRows; i++) { // starting from second row because we seeded the first
      List<Integer> row = new ArrayList<>();
      row.add(1); // add first 1 in each row
	  
      for (int j = 1; j < i; j++) {
        int left = result.get(i-1).get(j-1);
        int right = result.get(i-1).get(j);
        row.add(left + right); 
      }
	  
      row.add(1); // add last 1 to each row
      result.add(row);
    }

    return result;
        
    
    }
}