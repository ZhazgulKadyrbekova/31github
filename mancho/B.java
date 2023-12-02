package mancho;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var dna = scanner.next();

        int max = 0, count = 1;
        char prev = dna.charAt(0);
        for (int i = 1; i < dna.length(); i++) {
            char cur = dna.charAt(i);
            if (cur == prev) {
                count++;
            } else {
                if (max < count) {
                    max = count;
                }
                count = 1;
            }
            prev = cur;
        }
        if (max < count) {
            max = count;
        }
        System.out.println(max);
    }


}
