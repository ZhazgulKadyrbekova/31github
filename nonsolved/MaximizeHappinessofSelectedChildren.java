package nonsolved;

import java.util.Arrays;

public class MaximizeHappinessofSelectedChildren {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int len = happiness.length - 1;
        long sum = 0;
        for (int i = 0; i < k; i++) {
            int val = (happiness[len - i] - i) > 0 ? (happiness[len - i] - i) : 0;
            sum += val;
        }

        return sum;
    }
}
