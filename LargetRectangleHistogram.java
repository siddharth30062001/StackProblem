import java.util.Stack;

public class LargetRectangleHistogram {
    
    public static int largestRectangleArea(int[] heights) {
        
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;  
        int n = heights.length;

        for (int i = 0; i < n; i++) {
    
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        
            stack.push(i);
        }

        
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : n - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(histogram));
    }
}
