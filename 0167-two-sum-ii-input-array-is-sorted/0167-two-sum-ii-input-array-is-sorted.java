class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int leftPoint = 0;
        int rightPoint = numbers.length -1;        
                
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[leftPoint] + numbers[rightPoint] == target) {
                return new int[]{leftPoint+1, rightPoint+1};
            }
            
            if(numbers[leftPoint] + numbers[rightPoint] > target) {
                rightPoint--;
            } else {
                leftPoint++;
            }
        }
        return new int[]{};
    }
}