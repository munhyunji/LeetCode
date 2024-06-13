class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        Arrays.sort(strs);
        
        //["flight", "flow", "flower"]
        // prefix를 간단하게 구하는법.
        // 배열을 정렬한다. => 사전순으로 단어가 배열되기때문에 앞,맨뒤 글자가 같은경우
        // 가운데 글자도 prefix라고한다.. 의심하지말것.. 
        
        String firstWord = strs[0];
        String lastWord = strs[strs.length-1];
        
        // 앞, 맨뒤문자를 할당해서 문자열을 비교한다.. 
        int j = 0;
        for(int i = 0; i < Math.min(firstWord.length(), lastWord.length()); i++) {
            if(firstWord.charAt(i) != lastWord.charAt(i)) {
                return sb.toString();
            } 
            
            sb.append(firstWord.charAt(i));
        }
        return sb.toString();
    }
}