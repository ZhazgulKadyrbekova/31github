package atcoder;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        var solution = new A();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution.solve(n));
    }

    public String solve(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sb.append('x');
            }
            else {
                sb.append('o');
            }
        }
        return sb.toString();
    }
}
