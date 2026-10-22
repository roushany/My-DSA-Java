class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long result = 0;
        while (i < n && s.charAt(i) == ' ') {
        i++;
        }
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        sign = (s.charAt(i) == '-') ? -1 : 1;
        i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
        int digit = s.charAt(i) - '0';

        result = result * 10 + digit;
        long number = result * sign;

        if (number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (number < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        i++;
        }
        return (int) (result * sign);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna