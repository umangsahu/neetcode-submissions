class Solution {
    public boolean dfs(int[] matchsticks,int target,  int[] square, int index) {
        if (index == matchsticks.length) {
            if (square[0] == square[1] && square[1] == square[2] && square[2] == square[3]) {
                return true;
            }
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if(square[i] + matchsticks[index]>target) continue;
            square[i] += matchsticks[index];
            if (dfs(matchsticks, target, square, index + 1)) {
                return true;
            }
            square[i] -= matchsticks[index];
        }

        return false;
    }
    public boolean makesquare(int[] matchsticks) {
        int[] square = new int[4];
        int sum = 0;
        for (int i = 0; i < matchsticks.length; i++) {
           sum += matchsticks[i];
        }
        int target = sum/4;
        return dfs(matchsticks, target, square, 0);
    }
}