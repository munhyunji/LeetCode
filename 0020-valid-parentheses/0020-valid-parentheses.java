class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack<>();
        
        for(char p : s.toCharArray()) {
            if(p == '(' || p == '[' || p == '{') {
                stack.push(p);
            } else if ( p == ')' || p == ']' || p == '}') {
                
                //Before peek(), check if stack is Empty
                if(stack.isEmpty()) {
                    return false;
                } 
                
                if(stack.peek() == '(' && p == ')') {
                     stack.pop();
                 } else if (stack.peek() == '[' && p == ']') {
                     stack.pop();
                 } else if (stack.peek() == '{' && p == '}') {
                     stack.pop();
                 } else {
                    return false; 
                }                
            }
        }
        return stack.isEmpty();
    }
}




