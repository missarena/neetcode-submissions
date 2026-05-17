class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = 0;

        // find maximum pile
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            long hours = 0;

            // calculate total hours needed at speed = mid
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            // possible answer
            if (hours <= h) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return ans;
    }
}