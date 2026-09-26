class Solution {
    Stack<Integer> numSt = new Stack<>();
    Stack<String> charSt = new Stack<>();
    public String multiple(int n, String s) {
        if (n == 1)
            return s;

        return s + multiple(n - 1, s);
    }
    public Boolean isNum(char c) {
        return Character.isDigit(c);
    }

    public int parseNum(String s, int i) {
        int endInd = i;

        for (; endInd < s.length(); endInd++) {
            if (!isNum(s.charAt(endInd)))
                break;
        }
        int num = Integer.parseInt(s.substring(i, endInd));

        numSt.push(num);
        return endInd;
    }

    public String decodeString(String s) {
        int len = s.length();
        int i = 0;
        while (i < len) {
            if (isNum(s.charAt(i))) {
                i = parseNum(s, i);
            } else {
                if (s.charAt(i) == ']') {
                    String madeupString = "";
                    while (!charSt.isEmpty()) {
                        if (charSt.peek().equals("[")) {
                            charSt.pop();
                            break;
                        }
                        String revSt = charSt.pop();
                        madeupString = revSt + madeupString;
                    }
                    
                    charSt.push(multiple(numSt.pop(), madeupString));
                } else {
                    charSt.push("" + s.charAt(i) + "");
                }
                i++;
            }
        }
                            String madeupString = "";
                    while (!charSt.isEmpty()) {
                        if (charSt.peek().equals("[")) {
                            charSt.pop();
                            break;
                        }
                        String revSt = charSt.pop();
                        madeupString = revSt + madeupString;
                    }
        return madeupString ;
    }
}