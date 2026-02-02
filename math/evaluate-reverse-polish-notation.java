class Solution {
    private static boolean isOperator(String op){
        return (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
    }
    public int evalRPN(String[] exps) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < exps.length ; i++){
            
            if(isOperator(exps[i])){
                int n1 = stk.pop();
                int n2 = stk.pop();
                switch(exps[i]){
                    case "+":
                        stk.push(n1+n2);
                        break;
                    case "-":
                        stk.push(n2-n1);
                        break;
                    case "*":
                        stk.push(n1*n2);
                        break;
                    case "/":
                        stk.push(n2/n1);
                        break;
                }
            }
            else stk.push(Integer.parseInt(exps[i]));
        }
        return stk.pop();
    }
}