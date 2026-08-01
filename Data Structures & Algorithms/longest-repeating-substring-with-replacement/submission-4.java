class Solution {
    public int characterReplacement(String s, int k) {
        Map<String, Integer> mp = new HashMap<>();

        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int char_needs_to_be_change = 0;
        int maxWindow = 0;

        while (r < s.length()) {
            String si = "" + s.charAt(r) + "";
            mp.put(si, mp.getOrDefault(si, 0) + 1);
            int freq = mp.get(si);
            maxFreq = Math.max(maxFreq, freq);
            while ((r - l+1 ) - maxFreq > k) {
                String sr = "" + s.charAt(l) + "";
                mp.put(sr, mp.getOrDefault(sr, 0) - 1);
                l++; 
                maxFreq =0;
                for (int num : mp.values()) {
                    maxFreq = Math.max(maxFreq, num);
                }
            }
                        maxWindow = Math.max(r - l+1 , maxWindow);

            r++;
        }

        return maxWindow;
    }
}
