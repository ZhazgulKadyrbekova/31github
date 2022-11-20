package atcoder278;

import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        boolean[][] arr = new boolean[n][n];
        while (q-- > 0) {
            int t = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (t == 1) {
                arr[a-1][b-1] = true;
            } else if (t == 2) {
                arr[a-1][b-1] = false;
            } else {
                String res = arr[a-1][b-1] && arr[b-1][a-1] ? "Yes" : "No";
                System.out.println(res);
            }
        }
    }
}
