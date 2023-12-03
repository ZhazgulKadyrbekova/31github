package cfs;

import java.util.Scanner;

//112A - Петя и строки
class Петяистроки {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fir = scanner.next().toLowerCase();
        String sec = scanner.next().toLowerCase();

        var output = 0;

        for (int i = 0; i < fir.length(); i++) {
            var res = compare(fir.charAt(i), sec.charAt(i));
            if (res != 0) {
                output = res;
                break;
            }
        }

        System.out.println(output);
    }

    public static int compare(char fir, char sec) {
        return Integer.compare(fir, sec);
    }
}