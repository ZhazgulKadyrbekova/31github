package ya;

import java.util.HashMap;
import java.util.Scanner;

public class C2 {
    public static HashMap<String, Integer> map = new HashMap<>();
    public static Boolean[] finished = new Boolean[]{false};
    public static int k = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] res = new String[]{""};
        while (k < n) {
            String[] text = scanner.nextLine().split(" ");
            if (text[0].equals("1")) {
                res[k] = text[1];
                finished[k] = true;
                String key = "C" + k + 1;
                map.put(key, Integer.parseInt(text[1]));
            } else {
                res[k] = getSum(text[1]);
            }
            k++;
        }
        k = 0;
        while (k < n) {
            if (finished[k]) {
                k++;
                continue;
            }
            res[k] = getSum(res[k]);
            k++;
        }
        System.out.println(res);
    }

    public static String getSum(String text) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int start = 0;
        while (i < text.length()) {
            if (text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '*') {
                String key = text.substring(start, i);
                if (!map.containsKey(key)) {
                    finished[k] = false;
                    return text;
                } else {
                    int value = map.get(key);
                    sb.append(value).append(text.charAt(i));
                }
                start = i + 1;
            }
            i++;
        }
        String key = text.substring(start, i);
        if (!map.containsKey(key)) {
            finished[k] = false;
            return text;
        } else {
            int value = map.get(key);
            sb.append(value);
        }

        String res = solve(sb.toString());
        finished[k] = true;
        key = "C" + k + 1;
        map.put(key, Integer.parseInt(res));
        return res;
    }

    public static String solve(String text) {
        int index;
        while (text.indexOf('*') != -1) {
            index = text.indexOf('*');
            text = operation(text, index, Operation.MULTIPLY);
        }
        while (text.indexOf('+') != -1) {
            index = text.indexOf('+');
            text = operation(text, index, Operation.PLUS);
        }
        while (text.indexOf('-') != -1) {
            index = text.indexOf('-');
            text = operation(text, index, Operation.MINUS);
        }
        return text;
    }

    public static String operation(String text, int index, Operation operation) {
        int start = index - 1;
        while (start != 0 && !isSign(text.charAt(start))) {
            start -= 1;
        }
        int end = index + 1;
        while (end != text.length() && !isSign(text.charAt(end))) {
            end += 1;
        }
        int fir = Integer.parseInt(text.substring(start, index));
        int sec = Integer.parseInt(text.substring(index + 1, end + 1));
        int res = 0;
        switch (operation) {
            case MULTIPLY: {
                res = fir * sec;
                break;
            }
            case PLUS: {
                res = fir + sec;
                break;
            }
            case MINUS: {
                res = fir - sec;
                break;
            }
        }
        if (start != 0) start += 1;
        return text.replace(text.substring(start, end), String.valueOf(res));
    }

    public static boolean isSign(char sign) {
        return sign == '+' || sign == '-' || sign == '*';
    }
}

enum Operation {
    PLUS,
    MINUS,
    MULTIPLY
}