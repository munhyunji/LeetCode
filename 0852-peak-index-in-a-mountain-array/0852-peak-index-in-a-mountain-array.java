class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right) {
            int middle = left + (right-left)/2;
            
            if(middle > 0 && arr[middle] < arr[middle-1]) { //왼쪽보다 작으면 R을 옮김
                right = middle-1;
            } else if (middle < arr.length-1 && arr[middle] < arr[middle+1]) { //오른쪽보다 작으면 L을 ㅇ롬김
                left = middle+1;
            } else {
                return middle;
            }
        }
        return 0; 
    }
}