import done.EditDistance;

public class Solution {
    public static void main(String[] args) {
        var solution = new EditDistance();

        var res = solution.minDistance("zoo", "zooo");
        System.out.println(res);
    }
}
