class Solution {
    public int findTotalHours(int[] piles, int hourly) {
        int totalTakingHourToEat = 0;
        for (int i = 0; i < piles.length; i++) {
            totalTakingHourToEat += Math.ceil(((double) piles[i] / (double) hourly));
        }

        return  totalTakingHourToEat;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max_value = -1;

        for (int i = 0; i < piles.length; i++) {
            max_value = Math.max(max_value, piles[i]);
        }
        int minTime = max_value;
        int left = 1;
        int right = max_value;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int timeTaken = findTotalHours(piles, mid);
            if (timeTaken <= h) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
