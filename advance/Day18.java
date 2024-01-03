package advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day18 {

    public List<Long> hashes = new ArrayList<>();

    public long solve() throws IOException{
        getInputList();
        System.out.println(hashes);
        return getSum();
    }

    public void getInputList() throws IOException {
        String[] inputArr = Files
                .readString(Path.of("src/advance/input.txt"))
                .split(",");
        hashes = Arrays.stream(inputArr)
                .map(this::getHash)
                .collect(Collectors.toList());
    }

    public long getHash(String text) {
        long sum = 0;
        for (char i : text.toCharArray()) {
            sum = (sum + i) * 17;
            sum %= 256;
        }
        return sum;
    }

    public long getSum() {
        return hashes.stream().mapToLong(Long::longValue).sum();
    }

}