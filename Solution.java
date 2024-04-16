import done.DetermineifTwoStringsAreClose;

public class Solution {
    public static void main(String[] args) {
        var solution = new DetermineifTwoStringsAreClose();
        System.out.println(solution.closeStrings("arr", "abc"));
        System.out.println(solution.closeStrings("abf", "abc"));
        System.out.println(solution.closeStrings("arr", "aba"));
    }
}
