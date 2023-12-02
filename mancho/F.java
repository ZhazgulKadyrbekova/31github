package mancho;

import java.util.Arrays;
import java.util.Scanner;

//F
public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Eratosfen eratosfen = new Eratosfen(1000000);
        while (scanner.hasNext()) {
            int nmb = scanner.nextInt();
            if (nmb == 0)
                continue;
            getDivisors(nmb, eratosfen.primes);
        }
    }

    public static void getDivisors(int nmb, boolean[] primes) {
        int fir = 0;
        int sec = 0;
        for (int i = 3; i <= nmb; i+=2) {
            fir = i;
            sec = nmb - fir;
            if (primes[fir] && primes[sec]) {
                break;
            }
        }
        System.out.println(nmb + " = " + fir + " + " + sec);
    }

    public static class Eratosfen {
        boolean[] primes;
        public Eratosfen(int n) {
            primes=new boolean[n+1];
            fillSieve();
        }
        public void fillSieve() {
            Arrays.fill(primes, true);
            primes[0] = false;
            primes[1] = false;
            for (int i = 2; i < primes.length; ++i) {
                if (primes[i]) {
                    for (int j = 2; i * j < primes.length; ++j) {
                        primes[i * j] = false;
                    }
                }
            }
        }
    }
}
