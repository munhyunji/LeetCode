class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        
        for(char c : jewels.toCharArray()) {
            map.put(c, 0);
        }
        
        for(char c : stones.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0)+1);
            }
        }
        
        int total = 0;
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            total += entry.getValue();
        }
        
        return total;
    }
}