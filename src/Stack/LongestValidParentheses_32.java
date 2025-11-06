class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max=0;
        // traverse in the string
        for(int i=0;i<s.length();i++){
            // if opening bracket founded  add to stack
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                // else first remover any opening brackets in the stack
                st.pop();
                if(st.isEmpty()){
                    // push index of new opening bracket or closing which can help us in future
                    st.push(i);
                }
                else{
                    max=Math.max(max,i-st.peek());
                }
            }
        }
        return max;
    }
}