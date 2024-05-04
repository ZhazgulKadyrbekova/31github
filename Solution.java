import done.DecodeString;

public class Solution {
    public static void main(String[] args) {
        var solution = new DecodeString();

        System.out.println(solution.decodeString("3[a]2[bc]"));
        System.out.println(solution.decodeString("3[a2[c]]"));
        System.out.println(solution.decodeString("2[abc]3[cd]ef"));
        System.out.println(solution.decodeString("3[a2[c]b]"));
        System.out.println(solution.decodeString("2[3[ad]w]2[bc]"));
        System.out.println(solution.decodeString("100[leetcode]"));
        System.out.println(solution.decodeString("11[leetcod]e"));
        System.out.println(solution.decodeString("11[leetcode]"));
    }
}
