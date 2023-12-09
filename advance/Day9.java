package advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day9 {

//    1_898_776_583
    public static void main(String[] args) throws IOException {
        List<Long> resList = getInputList();

        System.out.println(Arrays.toString(resList.toArray()));
        var res = resList.stream().mapToLong(Long::longValue).sum();

        System.out.println(res);
    }

    public static List<Long> getInputList() throws IOException {
        return Files.readAllLines(Path.of("src/advance/input.txt"))
                .stream().map(input -> {
                    var bef = input.split(" ");
//                    System.out.println(Arrays.toString(bef));
                    var aft = getRes(bef);
//                    System.out.println(aft);
                    return aft;
                })
                .collect(Collectors.toList());
    }

    public static long getRes(String[] inputSplit) {
        List<Long> list = Arrays
                .stream(inputSplit)
                .map(Long::valueOf)
                .collect(Collectors.toList());

        return list.get(0) - recur(list, list.get(list.size() - 1));
    }

    public static long recur(List<Long> list, Long last) {
        List<Long> newList = new ArrayList<>();
        var size = list.size();
        for (int i = 1; i < size; i++) {
            long dif = list.get(i) - list.get(i - 1);
            newList.add(i - 1, dif);
        }

        boolean b = newList.stream()
                .distinct()
                .count() <= 1;
        if (b) {
            return newList.get(0);
        }
        var newFirst = newList.get(0) - recur(newList, newList.get(newList.size() - 1));
//        System.out.println(newFirst);
        return newFirst;
    }
}