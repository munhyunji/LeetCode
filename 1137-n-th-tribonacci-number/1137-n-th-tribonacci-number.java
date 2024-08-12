class Solution {
    public int tribonacci(int n) {
        if(n == 1 || n == 0) return n;
        int[] array = new int[n+1];
        
        int one = array.length-1;
        int two = array.length-2;
        int thr = array.length-3;
        array[one] = 0;
        array[two] = 1;
        array[thr] = 1;
        for(int i = array.length-4; i>=0; i--) {
            array[i] = array[one--] + array[two--] + array[thr--];
        }
        return array[0];
    }
}