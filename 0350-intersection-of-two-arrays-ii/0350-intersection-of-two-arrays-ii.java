class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int n : nums1) list1.add(n);
        
        for(int s : nums2) {
            if(list1.contains(s)) {
                list2.add(s);
                list1.remove(Integer.valueOf(s));
            }
        }
                
        int[] nums = new int[list2.size()];
        int idx = 0;
        for(int n : list2) {
            nums[idx++] = n;
        }
        return nums;
    }
}