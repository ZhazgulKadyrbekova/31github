package mancho;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

//G
public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var steps = scanner.nextInt();
        var index = scanner.nextLong();
////        var index = 2_000_000;
//        long index = Long.MAX_VALUE - 1;// 1.1258999e+15;
//        System.out.println(index);

        if (index % 2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(degree(index));
        }

    }

    public static int degree(long index) {
//        var start = LocalDateTime.now();
//        System.out.println(start);
        int count = 1;
        do {
            count++;
            index /= 2;
        } while (index % 2 == 0);
//        var end = LocalDateTime.now();
//        System.out.println(end);
//        long l = Duration.between(start, end).toMillis();
//        System.out.println(l);
        return count;
    }

    public static int createArray(int steps, int index) {
        var arraySize = 1;
        for (int i = 2; i <= steps; i++) {
            arraySize *= 2;
            arraySize += 1;
            if (arraySize > index) {
                return getIndexElem(i, index, arraySize);
            }
        }
        return 0;
    }

    public static int getIndexElem(int step, int index, int size) { //4, 8, 15
        return binarySearch(0, size, index, step);
    }

    public static int binarySearch(int l, int r, int x, int step) {
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (m == x)
                return step;

            if (m < x)
                l = m + 1;

            else
                r = m - 1;

            step--;
        }

        return -1;
    }
}
