package done;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    private void fillTheList(String brackets, List<String> list, int open, int close, int n) {
        if (open == close && open + close == 2 * n) {
            list.add(brackets);
            return;
        }

        if (open < n) {
            fillTheList(brackets.concat("("), list, open + 1, close, n);
        }

        if (close < open) {
            fillTheList(brackets.concat(")"), list, open, close + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        String brackets = "(";

        fillTheList(brackets, list, 1, 0, n);

        return list;
    }

    //Time C:   O(2^n)
    //Space C:  O(n)
}
