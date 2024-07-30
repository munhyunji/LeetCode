class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left < right) {
            int cur = (right-left) * Math.min(height[left], height[right]);
            max = Math.max(cur, max);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}