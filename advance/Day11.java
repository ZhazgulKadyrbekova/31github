package advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Day11 {

    public List<String> inputList;
    public List<Coordinate> coordinates = new ArrayList<>();

    public long solve() throws IOException{
        getInputList();
//        printCoordinates();
        updateInputListRow();
//        printCoordinates();
        updateInputListColumn();
        printCoordinates();

        return getDistanceSum();
    }

    public void getInputList() throws IOException {
        int count = 0;
        inputList = Files.readAllLines(Path.of("src/advance/input.txt"));
        for (String input : inputList) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '#') {
                    coordinates.add(new Coordinate(i, count));
                }
            }
            count++;
        }
    }

    public void updateInputListRow() {
        boolean isEmpty;
        var count = 0;
        for (int k = 0; k < inputList.size(); k++) {
            isEmpty = true;
            String input = inputList.get(k);
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '#') {
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty) {
                incrementCoordinatesRow(k + count);
                count++;
            }
        }

    }
    public void incrementCoordinatesRow(int startIndex) {
        coordinates.stream()
                .filter(it -> it.y >= startIndex)
                .forEach(it -> it.y += 1);
    }

    public void updateInputListColumn() {
        boolean isEmpty;
        var count = 0;
        for (int k = 0; k < inputList.get(0).length(); k++) {
            isEmpty = true;
            String input = inputList.get(k);
            for (int i = 0; i < input.length(); i++) {
                if (inputList.get(i).charAt(k) == '#') {
                    isEmpty = false;
                    break;
                }
            }
            if (isEmpty) {
                incrementCoordinatesColumn(k + count);
                count++;
            }
        }

    }
    public void incrementCoordinatesColumn(int startIndex) {
        coordinates.stream()
                .filter(it -> it.x >= startIndex)
                .forEach(it -> it.x += 1);
    }

    public long getDistanceSum() {
        long sum = 0;
        for (int i = 0; i < coordinates.size(); i++) {
            for (int j = i + 1; j < coordinates.size(); j++) {
                Coordinate fir = coordinates.get(i);
                Coordinate sec = coordinates.get(j);
                sum += (Math.abs(fir.x - sec.x) + Math.abs(fir.y - sec.y));
            }
            System.out.println(sum);
        }
        return sum;
    }

    public void printCoordinates() {
        System.out.println("***************************************************");
        for (Coordinate c : coordinates) {
            System.out.println(c);
        }
    }

    public static class Coordinate {
        int x;
        int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public String toString() {
            return "x = " + x + "\ty = " + y;
        }
    }
}