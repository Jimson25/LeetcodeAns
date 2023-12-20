package easy;

public class Solution_58 {
    public int lengthOfLastWord(String s) {
        int effIndex = -1, empChar = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (effIndex == -1 && s.charAt(i) != ' ') {
                effIndex = i + 1;
            }
            if (effIndex != -1 && s.charAt(i) == ' ') {
                empChar = i + 1;
                break;
            }
        }
        return effIndex - empChar;
    }

    public static void main(String[] args) {
        Solution_58 s = new Solution_58();
        String s1 = "   fly me   to   the moon  ";
        s1 = " a";
        System.out.println(s.lengthOfLastWord(s1));
    }

}
