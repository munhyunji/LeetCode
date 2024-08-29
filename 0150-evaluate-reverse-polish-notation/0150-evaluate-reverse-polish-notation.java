class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++) {
            int left, right;
            
            if(tokens[i].equals("+")) {
                right = st.pop();
                left = st.pop();
                st.push(left + right);
            } else if (tokens[i].equals("-")) {
                right = st.pop();
                left = st.pop();
                st.push(left - right);
            } else if (tokens[i].equals("/")) {
                right = st.pop();
                left = st.pop();
                st.push(left / right);
            } else if (tokens[i].equals("*")) {
                right = st.pop();
                left = st.pop();
                st.push(left * right);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.peek();
    }
}