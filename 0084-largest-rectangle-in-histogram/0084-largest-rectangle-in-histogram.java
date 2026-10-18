class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
       Stack<Integer> indexStack = new Stack<>();
       int maxArea = Integer.MIN_VALUE;

       for (int i = 0; i < n; i++) {
           while (!indexStack.isEmpty() && heights[i] < heights[indexStack.peek()]) {
               int topIndex = indexStack.pop();
               int height = heights[topIndex];
               int width = indexStack.isEmpty() ? i : (i - indexStack.peek() - 1);
               int area = height * width;
               maxArea = Math.max(maxArea, area);
           }

           indexStack.push(i);
       }
       while (!indexStack.isEmpty()) {
           int topIndex = indexStack.pop();
           int height = heights[topIndex];
           int width = indexStack.isEmpty() ? n : (n - indexStack.peek() - 1);
           int area = height * width;
           maxArea = Math.max(maxArea, area);
       }


       return maxArea;
   }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna