class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {
            // Opening brackets → push
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } 
            else {
                // No opening bracket to match
                if (top == -1) return false;

                char open = stack[top--];

                // Check pair
                if (c == ')' && open != '(') return false;
                if (c == '}' && open != '{') return false;
                if (c == ']' && open != '[') return false;
            }
        }

        
        return top == -1;
    }
}
