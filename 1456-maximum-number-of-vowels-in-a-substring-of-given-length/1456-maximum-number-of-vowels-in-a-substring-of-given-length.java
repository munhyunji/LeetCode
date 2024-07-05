class Solution {
    public int maxVowels(String s, int k) {
        
        int maxVowels = 0;

        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        
        for(int i = 0; i < k; i++ ) {
            if(vowels.contains(s.charAt(i))) {
                maxVowels++;
            }
        }
        int curVowels = maxVowels;
        
        for(int i = k; i < s.length(); i++) {
            if(vowels.contains(s.charAt(i))) {
               curVowels++; 
            }
            
            if(vowels.contains(s.charAt(i-k))) {
                curVowels--;
            }
            maxVowels = Math.max(maxVowels, curVowels);
        }
        return maxVowels; 
    }
}