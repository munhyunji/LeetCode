class Solution {
    public void sortColors(int[] nums) 
    {
        int n = nums.length;
        int[] countArray = new int[3];  // Since nums contains only 0, 1, and 2
        // Count occurrences of 0, 1, and 2
        for (int i = 0; i < n; i++) 
        {
            int element = nums[i];
            countArray[element]++;
        }
        int j = 0;
        // Overwrite nums with the sorted values
        for (int element = 0; element < 3; element++) 
        {
            while (countArray[element] > 0) 
            {
                nums[j] = element;
                j++;
                countArray[element]--;
            }
        }
    }
}