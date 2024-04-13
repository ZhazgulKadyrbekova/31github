package atcoder;

import java.util.HashMap;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            if (map.containsKey(c)) {
                int value = map.get(c);
                if (a < value) {
                    map.put(c, a);
                }
            } else {
                map.put(c, a);
            }
        }

        int max = 0;
        for (Integer i : map.values()) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);

    }

}
