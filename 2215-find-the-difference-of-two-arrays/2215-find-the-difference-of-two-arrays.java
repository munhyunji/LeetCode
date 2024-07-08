class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
 
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<Integer> tmp1 = new ArrayList<>();
        List<Integer> tmp2 = new ArrayList<>();
        
        for(int num : nums1) set1.add(num);
        for(int num : nums2) set2.add(num);

        for(int n : set1) {
            if(!set2.contains(n)) {
              tmp1.add(n);               
            }
        }
        
        for(int n : set2) {
          if(!set1.contains(n)) {
            tmp2.add(n);
            }  
        }
 
        return Arrays.asList(tmp1,tmp2);
    }
}