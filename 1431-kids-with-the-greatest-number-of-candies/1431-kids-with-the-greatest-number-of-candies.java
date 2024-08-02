class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> extra = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        for(int candy : candies) {
            if(candy > max) {
                max = candy; 
            }
        }
        for(int i=0; i< candies.length; i++) {
             extra.add(candies[i]+extraCandies >= max);          
        }
        return extra;
    }
}