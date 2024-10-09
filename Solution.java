import done.GenerateParentheses;

public class Solution {
    public static void main(String[] args) {
        var solution = new GenerateParentheses();

        for (String i : solution.generateParenthesis(4))
            System.out.println(i);
    }

}
