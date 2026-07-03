class Solution {
    public int getLucky(String s, int k) {
        StringBuilder num = new StringBuilder();

        // Convert each character to its alphabet position
        for (char ch : s.toCharArray()) {
            num.append(ch - 'a' + 1);
        }

        // Perform the transformation k times
        while (k-- > 0) {
            int sum = 0;

            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }

            num = new StringBuilder(String.valueOf(sum));
        }

        return Integer.parseInt(num.toString());
    }
}