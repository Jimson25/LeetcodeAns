package medium.solution_03;

public class Solution_03 {
    // abcabcbb
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        short[] chars = new short[127];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); ) {
//                System.out.print(s.charAt(j) + ", ");
                int charAt = s.charAt(j);
                // 出现重复字符
                if (chars[charAt] == 1) {
                    if (j - i > maxLen) {
                        maxLen = j - i;
                    }
                    chars = new short[127];
                    break;
                } else {
                    chars[charAt] = 1;
                }
                if (++j == s.length()) {
                    maxLen = Math.max(j - i, maxLen);
                    chars = new short[127];
                }
            }
//            System.out.println();
        }

        return maxLen;
    }
}
