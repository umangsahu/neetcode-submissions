class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";

        int left = 0;
        int right = 0;
        int count = 0;

        int index = -1;
        int minLength = Integer.MAX_VALUE;

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        while (left < s.length()) {
            if (count < t.length() && right < s.length()) {
                char c = s.charAt(right);
                int frequency = freq.getOrDefault(c, 0);
                if (frequency > 0) {
                    count++;
                }

                freq.put(c, frequency - 1);
                right++;
                if (right - left < minLength && count == t.length()) {
                    index = left;
                    minLength = right - left;
                }
            } else {
                if (right - left < minLength && count == t.length()) {
                    index = left;
                    minLength = right - left;
                }
                char c = s.charAt(left);
                int frequency = freq.getOrDefault(c, 0);
                if (frequency >= 0) {
                    count--;
                }

                freq.put(c, frequency + 1);
                left++;
            }
        }

        return index == -1 ? "" :s.substring(index, index + minLength);
    }
}
