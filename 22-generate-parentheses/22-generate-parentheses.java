class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        
        helper(res, "",0,0,n);
        return res;
    }
    public void helper(List<String> res, String s, int open , int close, int n)
    {
        if(s.length()== n*2)
        {
            res.add(s);
            return;
        }
        if(open<n)
        {
            helper(res,s+"(",open+1,close,n);
        }
        if(close<open)
        {
            helper(res,s+")",open,close+1,n);
        }
    }
}