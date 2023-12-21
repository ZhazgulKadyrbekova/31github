package done;

public class StringCompression {

    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
        int count = 1;
        int size = chars.length;
        if (size == 0) {
            return 0;
        }

        for (readIndex = 1; readIndex < size + 1; readIndex++) {
            if (readIndex < size && chars[readIndex] == chars[readIndex - 1]) {
                count++;
            } else {
                chars[writeIndex++] = chars[readIndex - 1];
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (int k = 0; k < countStr.length(); k++) {
                        chars[writeIndex++] = countStr.charAt(k);
                    }
                }
                count = 1;
            }
        }
        return writeIndex;
    }

}