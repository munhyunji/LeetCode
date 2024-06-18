class Solution {
    public void rotate(int[] nums, int k) {
         k %= nums.length; // k가 배열의 길이보다 큰 경우를 처리하기 위해 k를 조정
        //k가 7이고 num.length가 5인경우 7 % 5 로 2가된다. 그러므로 배열이 두번 회전한 결과가 됨 
        int n = nums.length-1;
        reverse(nums, 0, n);
        reverse(nums, k, n);
        reverse(nums, 0, k-1);
    }
    
    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}