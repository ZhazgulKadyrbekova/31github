package atcoder;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            double max = 0;
            int iMax = 0;
            for (int j = 0; j < n; j++) {
                double dist = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
                if (dist > max) {
                    max = dist;
                    iMax = j;
                }
            }
            System.out.println(iMax + 1);
        }

    }

}
