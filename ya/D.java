package ya;

import java.util.*;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] arr = new String[n];
        int k = 0;
        while (k < n) {
            arr[k++] = scanner.nextLine();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String fir = arr[i];
                String sec = arr[j];
                if (fir == sec) continue;
                int dif = 0;
                for (int m = 0; m < fir.length(); m++) {
                    if (fir.charAt(m) != sec.charAt(m)) dif++;
                    if (dif > 1) break;
                }
                if (dif == 1) {
                    System.out.println(fir + "\t" + sec);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
