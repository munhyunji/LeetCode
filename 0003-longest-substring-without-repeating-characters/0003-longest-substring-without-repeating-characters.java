class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        
        int leftPointer = 0;
        int maxlength = 0;
        //"pwwkew"
        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) { //중복이 발생되면 이전까지의 문자를 반복해서 지움
                set.remove(s.charAt(leftPointer));       
                leftPointer++; 
            }            
            set.add(s.charAt(right));    
            maxlength = Math.max(maxlength, set.size());
        }
        return maxlength;
    }
}