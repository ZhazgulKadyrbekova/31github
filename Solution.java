import done.CompareVersionNumbers;

public class Solution {
    public static void main(String[] args) {
        var solution = new CompareVersionNumbers();

        System.out.println(solution.compareVersion("1.1", "1.10"));
        System.out.println(solution.compareVersion("1.01", "1.001"));
        System.out.println(solution.compareVersion("1.0", "1.0.0"));
        System.out.println(solution.compareVersion("1.1.0.1", "1.1"));
        System.out.println(solution.compareVersion("0.1", "1.1"));
    }

}
