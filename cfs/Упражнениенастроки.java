package cfs;

import java.util.List;
import java.util.Scanner;

//118A - Упражнение на строки
public class Упражнениенастроки {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> vowels = List.of('a', 'o', 'e', 'i', 'u', 'y');

        String txt = scanner.next().toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (char charic : txt.toCharArray()) {
            if (!vowels.contains(charic)) {
                builder.append('.').append(charic);
            }
        }

        System.out.println(builder);
    }

}