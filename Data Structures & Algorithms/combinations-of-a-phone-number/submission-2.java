class Solution {
    public void combine(
        Map<Character, String> st, String digits, int i, String s, List<String> ans) {
        if (digits.length() == i) {
            ans.add(s);
            return;
        }

        String stringOnNum = st.get(digits.charAt(i));
        int len = stringOnNum.length();

        for (int ind = 0; ind < len; ind++) {
            combine(st, digits, i + 1, s + stringOnNum.charAt(ind), ans);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;

        Map<Character, String> st = new HashMap<>();
        st.put('2', "abc");
        st.put('3', "def");
        st.put('4', "ghi");
        st.put('5', "jkl");
        st.put('6', "mno");
        st.put('7', "pqrs");
        st.put('8', "tuv");
        st.put('9', "wxyz");

        combine(st, digits, 0, "", ans);

        return ans;
    }
}
