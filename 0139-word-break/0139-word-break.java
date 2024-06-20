class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        //길이생성
        boolean[] dp = new boolean[s.length()+1]; //기준을 삼기위해 빈배열 추가로 하나 생성
        //마지막 인덱스 = 빈문자열은 wordDict의 단어로 구성될수있다고 함.
        dp[s.length()] = true; // always true;
        
        // s = "leetcode", wordDict = ["leet","code"]
        //dp = [false, false, false, false, false, false, false, false, true]
        
        for(int i = s.length() -1 ; i >= 0; i-- ) {
            for( String word : wordDict ) {
                //i = 4 = c
                // 4+4 <= 8 && 4,8.equals(code)
                // dp[4]= dp[4+4] = true;
                
                if( i + word.length() <= s.length() && s.substring(i, i + word.length()).equals(word)) {
                    dp[i] = dp[i + word.length()];
                }
                if(dp[i]) {
                    break;
                }
            }
        }
        return dp[0];
    }
}

//substring (startIndex, endIndex) = > endIndex는 startIndex로부터 떨어진 거리를 써야함
//substring(startIndex, startIndex+endIndex) 해줘야함 . 
