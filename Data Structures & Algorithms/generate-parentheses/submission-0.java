class Solution {
    public void  solveGenerateParenthesis(List<String> list,int open,int close, String gen){
        if(open == 0 && close ==0 ) {
            list.add(gen);
        }

        if(open < close){
            solveGenerateParenthesis(list, open , close-1, gen+")");
        }
        if(open>0){
           solveGenerateParenthesis(list, open-1, close, gen+"(");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        int open = n;
        int close = n;

        solveGenerateParenthesis(list, open, close, "");

        return list;
    }
}
