package proggy;

import java.util.Scanner;

public class ChocolateProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n * m % 2 == 0) {
            System.out.println("Proggy");
        } else {
            System.out.println("Buggy");
        }

    }
}
