package cfs

import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`);
    val n = scanner.nextInt();
    for (l in 1..n) {
        var size = scanner.nextInt();   //5

        var sum = 0;
        var count = 0
        for (k in 0..2) {
            var text = scanner.nextLine();
            for (i in text.toCharArray()) {
                if (i == '*') {
                    count++;
                } else {
                    if (count != 0)
                        sum += count - 1;
                    count = 0;
                }
            }
            if (count != 0)
                sum += count - 1;
            count = 0;
        }
        println(sum);
    }
}
