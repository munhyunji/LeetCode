class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        int n = s.length();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= n/2; i++) {
            if(n % i == 0) {
                StringBuilder repeated = new StringBuilder();
                String br  = s.substring(0, i);
                for(int j = 0; j < n/i; j++) {
                    repeated.append(br);
                }
                if(s.equals(repeated.toString())) return true;
            }
        }
        return false;
    }
}