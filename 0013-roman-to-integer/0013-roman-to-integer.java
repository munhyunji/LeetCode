class Solution {
    
    
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //I
            //char p = s.charAt(i+1);
            int num = map.get(c);
            
            if(i == s.length() - 1 || map.get(s.charAt(i+1)) <= num ) {
                result += num;
            } else {
                result -= num;
            }
  
        }
        return result;
    }
}