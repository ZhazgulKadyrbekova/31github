package mancho;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var size = scanner.nextInt();

        boolean[] arr = new boolean[size];
        for (int i = 0; i < size-1; i++) {
            arr[scanner.nextInt() - 1] = true;
        }

        for (int i = 0; i < size; i++) {
            if (!arr[i]) {
                System.out.println(i + 1);
            }
        }
    }


}
