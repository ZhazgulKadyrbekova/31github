package advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day10 {

    public static List<String> list;
    public static List<Character> vertical1 = List.of('|','7','F');
    public static List<Character> vertical2 = List.of('|','L','J');
    public static List<Character> horizontalLeft = List.of('|','L','F');
    public static List<Character> horizontalRight = List.of('-','7','J');

    public static void main(String[] args) throws IOException {
        getInputList();

        //s coordinates
        Coordinate coordinate = new Coordinate(2, 0);

        System.out.println(steps(coordinate));
    }

    public static void getInputList() throws IOException {
        list = Files.readAllLines(Path.of("src/advance/input1.txt"));
    }

    public static int steps(Coordinate start) {

        Coordinate next = new Coordinate(start.x - 1, start.y);
        Coordinate front =

    }

    public static boolean isOk(Coordinate fir, Coordinate sec) {
        if (fir.x - sec.x == 1) {     //vertical2
            if (vertical2.contains(getChar(sec))) {
                return true;
            }
        }

    }

    public static char getChar(Coordinate coordinate) {
        return list.get(coordinate.x).charAt(coordinate.y);
    }

    public static class Coordinate {
        int x;
        int y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}