package atcoder278;

import java.util.*;
public class D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int t = sc.nextInt();
            if (t == 1) {
                int x = sc.nextInt();
                Arrays.fill(arr, x);
            } else if (t == 2) {
                int index = sc.nextInt();
                int x = sc.nextInt();
                arr[index - 1] += x;
            } else {
                int index = sc.nextInt();
                System.out.println(arr[index - 1]);
            }
        }
    }
}
