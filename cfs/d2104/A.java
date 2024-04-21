package cfs.d2104;

import java.util.HashMap;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();

            int n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                int elem = scanner.nextInt();
                int val = map.getOrDefault(elem, 0);
                map.put(elem, val + 1);
            }

            long res = map.values().stream().mapToInt(it -> it/3).sum();
            System.out.println(res);
        }
    }
}
