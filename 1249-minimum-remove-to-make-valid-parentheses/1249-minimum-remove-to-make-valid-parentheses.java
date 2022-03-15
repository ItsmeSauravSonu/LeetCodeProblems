class Solution {
    public String minRemoveToMakeValid(String s) {
       
      Stack<Integer> stack = new Stack<>();
        HashSet<Integer> set = new HashSet<>();  
        
        for (int i = 0; i < s.length(); i++) {
            
            char ch = s.charAt(i);
            
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    set.add(i);
                } else {
                    stack.pop();
                }
            }
        }
        
        while (!stack.isEmpty()) {
            set.add(stack.pop());            
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
       
        
}