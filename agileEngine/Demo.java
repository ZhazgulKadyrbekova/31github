package agileEngine;

import java.util.*;
import java.util.stream.Collectors;

class Demo {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 3, 6, 4, 1, 2};
        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set = Arrays.stream(A).boxed().filter(it -> it > 0).collect(Collectors.toSet());

        System.out.println(set);
        int cur = 1;
        for (int nmb : set) {
            if (cur != nmb)
                return cur;
            cur++;
        }

        return cur;
    }
}