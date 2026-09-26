class Solution {
    public String decodeString(String s) {
        Stack<Integer> numSt = new Stack<>();
        Stack<StringBuilder> strSt = new Stack<>();

        int num = 0;
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numSt.push(num);
                strSt.push(current);

                num = 0;
                current = new StringBuilder();

            } else if (c == ']') {
                int repeat = numSt.pop();
                StringBuilder previous = strSt.pop();

                for (int j = 0; j < repeat; j++) {
                    previous.append(current);
                }

                current = previous;
            } else {
                current.append(c);
            }
        }
        return current.toString();
    }
}