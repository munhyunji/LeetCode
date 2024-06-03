class Solution {
    public boolean backspaceCompare(String s, String t) {
 
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        

         for(char c : s.toCharArray()) {
            if( c != '#') {
                 st1.push(c);
                
            } else {
               if(!st1.isEmpty()) st1.pop();
            }
        }
        
        //ac
        
        for(char ch : t.toCharArray()) {
            if(ch != '#') {
               st2.push(ch);
            } else {
                if(!st2.isEmpty()) st2.pop();
            }
        }

        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
      
        while( !st1.isEmpty()) {
            sb1.append(st1.pop());
        }
        
        while(!st2.isEmpty()) {
            sb2.append(st2.pop());
        }
        
        if(sb1.toString().equals(sb2.toString())) {
            return true;
        } 
        
        return false;
    }
}