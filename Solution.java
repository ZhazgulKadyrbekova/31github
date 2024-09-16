import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        var solution = new MinimumTimeDifference();

        List<String> times = new ArrayList<>();
        times.add("00:00");
        times.add("23:59");
        times.add("00:00");
        System.out.println(solution.findMinDifference(times));
    }
}
