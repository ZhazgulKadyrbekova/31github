package done;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        int frontOpen = 0, frontClose = 0, backOpen = 0, backClose = 0;
        StringBuilder frontSb = new StringBuilder();
        StringBuilder backSb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            //front
            if (s.charAt(i) == '(') {
                if (frontOpen + 1 >= frontClose) {
                    frontOpen++;
                    frontSb.append(s.charAt(i));
                }
            }
            else if (s.charAt(i) == ')') {
                if (frontOpen >= frontClose + 1) {
                    frontClose++;
                    frontSb.append(s.charAt(i));
                }
            }
            else {
                frontSb.append(s.charAt(i));
            }
        }

        s = frontSb.toString();
        for (int j = s.length() - 1; j >= 0; j--) {
            //back
            if (s.charAt(j) == ')') {
                if (backOpen + 1 >= backClose) {
                    backOpen++;
                    backSb.insert(0, s.charAt(j));
                }
            }
            else if (s.charAt(j) == '(') {
                if (backOpen >= backClose + 1) {
                    backClose++;
                    backSb.insert(0, s.charAt(j));
                }
            }
            else {
                backSb.insert(0, s.charAt(j));
            }
        }
        return backSb.toString();
    }

}
