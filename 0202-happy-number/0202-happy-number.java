class Solution {
     public static boolean isHappy(int n) {
       Set<Integer> set = new HashSet<>();
         
         while( n != 1 && !set.contains(n)) { //2 is in a circle
             set.add(n);
             
             int sum = 0;
             while(n != 0) { //e.g. 121
                 int digit = n % 10; //각각 자리수를 빼오고 - 12'1'
                 sum += digit * digit; // 구한 자리수를 제곱하고 - 1 * 1
                 n /= 10; // 방금구한 자리수를 삭제 - 12
             }
             n = sum;
         }
         
      return n == 1; 
    }
}

