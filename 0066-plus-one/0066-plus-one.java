class Solution {
    public int[] plusOne(int[] digits) {
        //start from backward.
        //if the last number in the array is less than 9 then you can stop the loop and return digits array.
        // or if the last number is 9 and it becomes a tens digit, you should set it to 0;
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9 ) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // then create one longer array than orginal array
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}