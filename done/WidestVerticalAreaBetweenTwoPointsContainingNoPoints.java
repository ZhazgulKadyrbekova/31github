package done;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> xs = Arrays.stream(points)
                .map(it -> it[0])
                .sorted()
                .collect(Collectors.toList());

        int max = 0, i = 1;
        while (i < points.length) {
            var cur = xs.get(i) - xs.get(i - 1);
            if (cur > max) max = cur;
            i++;
        }
        return max;
    }
}
