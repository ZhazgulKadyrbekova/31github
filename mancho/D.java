package mancho;

import java.util.Scanner;

//D
public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var step = scanner.nextInt();

        for (int i = 1; i <= step; i++) {
            System.out.println(getAvailable(i));
        }
    }

    public static long getAvailable(int step) {
        if (step == 1) {
            return 0;
        }
        if (step == 2) {
            return 6;
        }
        if (step == 3) {
            return 28;
        }
        if (step == 4) {
            return 96;
        }

        var sides = step - 4;
        long allAvail = step * step * ((long) step * step - 1) / 2;
        System.out.print("*******\t" + allAvail + "\t*******\t");

        allAvail -= (24 + (long) sides * 4 * 4 / 2 + (long) sides * 4 * 6 / 2 + 8L * sides * sides / 2);
        return allAvail;
    }

}
