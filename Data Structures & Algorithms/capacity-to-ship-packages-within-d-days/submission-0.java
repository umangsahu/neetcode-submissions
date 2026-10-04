class Solution {
    public int findMaxCapacity(int[] weights) {
        int maxi = 0;

        for (int i = 0; i < weights.length; i++) {
            maxi += weights[i];
        }

        return maxi;
    }
     public int findMax(int[] weights) {
        int maxi = 0;

        for (int i = 0; i < weights.length; i++) {
            maxi = Math.max(weights[i], maxi);
        }

        return maxi;
    }
    public int dayCalculator(int[] weights, int capacity) {
        int days = 0;
        int i = 0;
        int temp = 0;
        while (i < weights.length) {
            if (temp + weights[i] > capacity) {
                days++;
                temp = 0;
            }
            temp += weights[i];
            i++;
        }
        return days + 1;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = findMax(weights);
        int right = findMaxCapacity(weights);
        int ans = Integer.MAX_VALUE;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int dayReq= dayCalculator(weights, mid);
            System.out.println(mid +","+ dayReq);
            if (days < dayReq) {
                left = mid + 1;
            }else{
                right = mid -1;
               ans = Math.min(ans, mid);
            }
        }

        return ans;
    }
}