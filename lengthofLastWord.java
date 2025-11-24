class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        // skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') i--;
        // count characters of the last word
        int len = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}
