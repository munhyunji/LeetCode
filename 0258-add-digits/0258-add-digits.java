class Solution {
    public int addDigits(int num) {
        //10 이하인 숫자들은 그대로 return 될수 있게 num을 반홚
        while( num >= 10) {
            int sum = 0;
            
            while( num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}