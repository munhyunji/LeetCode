class Solution {
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
         //edge case
         //attach new value 0 both sides of array 
         int[] newflowerbed = new int[flowerbed.length+2];
         newflowerbed[0] = 0;
         newflowerbed[newflowerbed.length-1] = 0;
         for(int i = 0; i < flowerbed.length; i++) {
             newflowerbed[i+1] = flowerbed[i];
         }
         //[0,1,0,0,0,1,0]
         //   i
         for(int i = 1; i < newflowerbed.length-1; i++) {
             if(newflowerbed[i-1]==0 && newflowerbed[i] == 0 && newflowerbed[i+1] == 0) {
                 newflowerbed[i] = 1;
                 n--;
             }
         }
         return n <= 0;
    }
}
