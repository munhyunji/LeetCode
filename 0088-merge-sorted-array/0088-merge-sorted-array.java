class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        // nums1 = [1,2,   3,0,0,0] = i
        // nums2 = [2,  5,6] = j 
        // [1,2,3, 2, 5 ,6]
        // m = 3  
        // n = 3
        
        for(int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    } 
}