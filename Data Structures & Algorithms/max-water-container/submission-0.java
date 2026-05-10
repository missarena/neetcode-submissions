class Solution {
    public int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int area = width * h;

                max = Math.max(max, area);
            }
        }

        return max;
    }
}