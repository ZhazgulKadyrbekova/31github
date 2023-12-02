package mancho;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var size = scanner.nextInt();
        var count = 0;
        for (int i = 0; i < size; i++) {
            var oper = scanner.next();
            if (oper.contains("++")) {
                count++;
            }
            if (oper.contains("--")) {
                count--;
            }
        }

        System.out.println(count);
    }


}
