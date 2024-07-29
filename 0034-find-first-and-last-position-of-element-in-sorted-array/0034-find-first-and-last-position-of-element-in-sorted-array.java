class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] indexes = {-1, -1};
        int left = findIndex(nums, target, true);
        int right = findIndex(nums, target, false);
        indexes[0]=left;
        indexes[1]=right;
        
        return indexes;
    }
    
    public int findIndex(int[] nums, int target, boolean isSearchingleft) {
        int left = 0;
        int right = nums.length-1;
        int idx = -1;
        
        while(left<=right){
            int mid = left + (right - left)/2;
            
            if(nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else {
               idx = mid; // 8, 8, 8, 8 
                //첫번째,마지막 target값의 위치를 찾기위해 왼쪽으로 더이동, 오른쪽으로 더이동  
                if (isSearchingleft) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                 
            }
        }
        return idx;
    }
}