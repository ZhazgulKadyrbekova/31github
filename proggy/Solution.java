package proggy;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int b = scanner.nextInt();
//        int e = scanner.nextInt();
//
//        int[] start = new int[n];
//        int[] end = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            start[i] = scanner.nextInt();
//            end[i] = scanner.nextInt();
//        }
//        String one = scanner.nextLine();
//        String two = scanner.nextLine();

        var res = c(n);
        System.out.println(res);

    }


    public static double c(int a) {
        double b = a * a / Math.PI;
        return Math.sqrt((a * a) / Math.PI);

    }

    public static int a(String max, String min) {
        int digits = 0;
        while (max.length() > 1) {
            max = max.substring(0,max.length() - 1);
            digits++;
        }
        while (min.length() > 2) {
            min = min.substring(1,min.length());
            digits++;
        }
        return digits;

//        1000000000000000000000000
//        0.000000000000000001

    }

    public static int f(int n, int b, int e, int[] start, int end[]) {
        boolean[] arr = new boolean[e];
        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j < end[i] && j < e; j++) {
                arr[j] = true;
            }
        }

        int count = 0;
        for (int i = b; i < e; i++) {
            if (!arr[i])
                count++;
        }
        return count;


    }

    public static String d(String one, String two) {
        var oneArr = one.toCharArray();
        Arrays.sort(oneArr);

        var twoArr = two.toCharArray();
        Arrays.sort(twoArr);

        if (Arrays.equals(oneArr, twoArr)) {
            return "PLAGIARISM";
        }
        return "AUTHENTIC";
    }


    public static String undecidable() {
        return "undecidable";
    }
}
