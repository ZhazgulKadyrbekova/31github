class StringCompression {

    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
        int count = 1;
        int size = chars.length;
        if (size == 0) {
            return 0;
        }

        char prev = chars[0];
        for (readIndex = 1; readIndex < size; readIndex++) {
            if (chars[readIndex] == prev) {
                count++;
            } else {
                if (count == 1) {
                    chars[writeIndex++] = prev;
                } else {
                    String countStr = String.valueOf(count);
                    chars[writeIndex++] = prev;
                    for (int k = 0; k < countStr.length(); k++) {
                        chars[writeIndex++] = countStr.charAt(k);
                    }
                    if (countStr.length() >= 2) {
                        writeIndex -= countStr.length() - 1;
                    }
                }
                prev = chars[readIndex];
                count = 1;
            }
        }
        if (count == 1) {
            chars[writeIndex++] = prev;
        } else {
            String countStr = String.valueOf(count);
            chars[writeIndex++] = prev;
            for (int k = 0; k < countStr.length(); k++) {
                chars[writeIndex++] = countStr.charAt(k);
            }
            if (countStr.length() >= 2) {
                writeIndex -= countStr.length() - 1;
            }
        }
        return writeIndex;
    }

}