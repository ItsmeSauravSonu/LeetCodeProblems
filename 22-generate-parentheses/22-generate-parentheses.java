class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        f(res, "",n,n);
        return res;
    }
    public void f(List<String> res, String s, int open, int close){
        if(open > close)
        return;
 
    if(open==0&&close==0){
        res.add(s);
        return;
    }
        if(open>0){
            f(res,s+"(", open-1, close);
        }
        if(close>0){
            f(res,s+")",open, close-1);
        }
    }
}