class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatestNum = new ArrayList<>();
        
        int max = Integer.MIN_VALUE;
        
        for( int candy : candies ) {
            if( candy > max) {
                max = candy;
            }
        }
        
        for(int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies >= max) {
                greatestNum.add(true);
            }else {
                greatestNum.add(false);
            }
        }
        
        return greatestNum;
        
    }
}