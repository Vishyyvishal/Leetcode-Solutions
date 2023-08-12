class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res = new ArrayList<>();
        String currOutput = "";
        helper(currOutput, n, n);
        
        return res;
    }
    
    public void helper(String currOutput, int open, int close) {
        if(open == 0 && close == 0) {
            res.add(currOutput);
            return;
        }
        
        // when count of open and close are the same, we can only do open
        if(open == close) {
            currOutput += "(";
            helper(currOutput, open - 1, close);
        } else if(open == 0) { // have to put closing
            currOutput += ")";
            helper(currOutput, open, close - 1);
        } else if(close == 0) { // can only put open
            currOutput += "(";
            helper(currOutput, open - 1, close);
        } else { 
            String op1 = currOutput, op2 = currOutput;
            op1 += "(";
            op2 += ")";
            helper(op1, open - 1, close);
            helper(op2, open, close - 1);
        }
    }
}