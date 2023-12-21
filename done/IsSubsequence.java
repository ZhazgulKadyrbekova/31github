package done;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        int i = 0;
        for (char ch : t.toCharArray()) {
            if (ch == s.charAt(i)) {
                i++;
            }

            if (s.length() == i) {
                return true;
            }
        }
        return false;
    }
}