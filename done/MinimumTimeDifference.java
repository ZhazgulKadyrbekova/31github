package done;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int minutes[] = new int[timePoints.size()];

        for (int i = 0; i < timePoints.size(); i++) {
            String timePoint = timePoints.get(i);
            minutes[i] = (timePoint.charAt(0) * 10 + timePoint.charAt(1)) * 60
                    + (timePoint.charAt(3) * 10 + timePoint.charAt(4));
        }

        Arrays.sort(minutes);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < timePoints.size(); i++) {
            min = Math.min(minutes[i] - minutes[i-1], min);
        }

        min = Math.min(minutes[0] + 1440 - minutes[minutes.length - 1], min);
        return min;

        //Time      O(n)        4ms         73.24%
        //Space     O(n)        45.42MB     55.15%
    }
}
