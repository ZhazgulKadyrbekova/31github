import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MinimumNumberofOperationstoMakeArrayEmpty {
    public int minOperations(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        int sum = 0;
        for (long i : map.values()) {
            int res = getDividee(i);
            if (res == -1) {
                return -1;
            }

            sum += res;
        }
        return sum;
    }

    private int getDividee(long num1) {
        int num = (int) num1;
        if (!isDivisible(num)) {
            return -1;
        }
        int count = 0;
        while (num > 0) {
            int res = divide(num);
            if (res != -1) {
                count += res;
                break;
            } else {
                count++;
                num -= 3;
            }
        }

        return count;
    }

    private int divide(int num) {
        if (num % 3 == 0) {
            return num / 3;
        }
        if (num % 2 == 0) {
            return num / 2;
        }

        return -1;
    }

    private boolean isDivisible(int num) {
        if (num == 1) {
            return false;
        }
        if (num % 2 == 0) {
            return true;
        }
        if (num % 3 == 0) {
            return true;
        }
        if ((num - 1) % 3 == 0 || (num + 1) % 3 == 0) {
            return true;
        }

        return false;
    }
}
