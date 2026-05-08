class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // The problem usually asks for 1-based indexing
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++; // Sum is too small, move the left pointer up
            } else {
                right--; // Sum is too large, move the right pointer down
            }
        }
        
        return new int[]{-1, -1}; // Should not happen per constraints
    }
}
