class Solution {
    public double myPow(double x, int n) {
        long val = n;
        if (val < 0) {
            return 1.0 / helper(x, -val);
        }
        return helper(x, val);
    }
    
    private double helper(double x, long n) {
        if (n == 0) return 1.0;
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna