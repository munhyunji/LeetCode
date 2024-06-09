class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestNum = new ArrayList<>();
        
        int maxCandies = Integer.MIN_VALUE;
        
        for( int candy : candies ) {
            if( candy > maxCandies ) {
                maxCandies = candy;
            }
        }
        
        for(int i = 0; i < candies.length; i++) {
            greatestNum.add(candies[i] + extraCandies >= maxCandies);
        }
        return greatestNum;
    } 
}