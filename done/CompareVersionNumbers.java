package done;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] fir = version1.split("\\.");
        String[] sec = version2.split("\\.");

        int max = Math.max(fir.length, sec.length);

        for (int i = 0; i < max; i++) {
            int dif;
            if (i >= fir.length) {
                dif = compare("0", sec[i]);
            }
            else if (i >= sec.length) {
                dif = compare(fir[i], "0");
            }
            else {
                dif = compare(fir[i], sec[i]);
            }

            if (dif != 0) {
                return dif;
            }
        }

        return 0;
    }

    private int compare(String fir, String sec) {
        int a = 0;
        for (char i: fir.toCharArray()) {
            a *= 10;
            a += (i - '0');
        }

        int b = 0;
        for (char i: sec.toCharArray()) {
            b *= 10;
            b += (i - '0');
        }

        if (a > b) {
            return 1;
        }
        else if (a < b) {
            return -1;
        }
        else {
            return 0;
        }

    }
}
