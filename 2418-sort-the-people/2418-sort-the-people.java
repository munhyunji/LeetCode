class Solution {
    public static String[] sortPeople(String[] names, int[] heights) {
       
        HashMap<Integer, String> people = new HashMap<>();
        int k = 0;
        for(int i = 0; i < names.length; i++) {
            people.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights); //165,170,180
        
        for(int i = heights.length -1; i >= 0; i--) {
            names[k++] = people.get(heights[i]);
        }
        return names;
    } 
}