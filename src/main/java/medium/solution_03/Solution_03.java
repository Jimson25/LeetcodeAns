package medium.solution_03;

public class Solution_03 {
    // abcabcbb
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int currLen = 0;
            char[] chars = new char[127];
            for (int j = i; j < s.length(); j++) {
                char charAt = s.charAt(j);
                if (chars[charAt] == 0) {
                    chars[charAt] = 1;
                } else {
                    break;
                }
                currLen = j - i;
            }
            maxLen = Math.max(currLen + 1, maxLen);
        }

        return maxLen;
    }
}
