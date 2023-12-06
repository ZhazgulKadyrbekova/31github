package advance;

public class Solution {

    public static void main(String[] args) {
//        int a = 44, b = 283;
//        int a = 70, b = 1134;
        long a = 44_707_080;
        String b = "283113411341491";

        //29,19,19,21
        var count = 0;
        long start = 0;
        long finish = 0;
        for (long i = 1; i <= a; i++) {
            long multiply = i * (a - i);
            var compare = compare(String.valueOf(multiply), b);
            if (compare == 1) {
                count++;
                start = i;
                System.out.println(i + "\t" + (a - i) + "\t" + multiply + "\t" + compare);

                break;

            }
        }

        for (long i = a; i > 1; i--) {
            long multiply = i * (a - i);
            var compare = compare(String.valueOf(multiply), b);
//            System.out.println(i + "\t" + (a - i) + "\t" + multiply + "\t" + compare);
            if (compare == 1) {
                count++;
                finish = i;
                System.out.println(i + "\t" + (a - i) + "\t" + multiply + "\t" + compare);

                break;
            }
        }

        System.out.println(finish - start + 1);          //319874 - too low; 39984007 - too high
//        System.out.println(compare("100000566579591", b));          //319874 - too low; 39984007 - too high; 29432449 - too low
    }

    public static int compare(String fir, String sec) {
        if (fir.length() > sec.length()) {
            return 1;
        }
        if (fir.length() < sec.length()) {
            return -1;
        }
        var size = fir.length();
        for (int i = 0; i < size; i++) {
            var res = compare(fir.charAt(i), sec.charAt(i));
            if (res != 0) {
                return res;
            }
        }
        return 0;
    }

    public static int compare(char fir, char sec) {
        return Character.compare(fir, sec);
    }
}