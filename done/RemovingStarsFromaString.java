package done;

import java.util.Stack;
import java.util.stream.Collectors;

public class RemovingStarsFromaString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
        }
        return stack.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}
