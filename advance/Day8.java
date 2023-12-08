package advance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Day8 {

    public static String steps = "LRLRLLRLRLRRLRLRLRRLRLRLLRRLRRLRLRLRLLRRRLRRRLLRRLRLRLRRRLRRLRRRLRLRLRRLRLLRLRLRRLRRRLRLRRLRRRLLRLRLRRRLRRRLRLRRRLRLRRRLLRRLLLRRRLLRRRLRRRLRRRLRLRLRLLRLRRLRLRLLLRRLRRLRRLRLRRLRRLLRRLRLRRRLRLRLLRRRLRRRLRRRLLLRRRLRLRLRRLRRRLRRRLRLRRRLRRLRRRLRLRRLLRRRLRRRLLLRRLRLRLRRLRRRLRRLRRLRLRRRR";

    public static void main(String[] args) throws IOException {
        Map<String, Instruction> instructionMap = getInputList();

        var count = 0;
        boolean success = false;
        var instruction = instructionMap.get("AAA");
        while (!success) {
            for (Character step : steps.toCharArray()) {
                count++;
                String newKey;
                if (step == 'L') {
                    newKey = instruction.left;
                } else {
                    newKey = instruction.right;
                }
                if (newKey.equals("ZZZ")) {
                    success = true;
                    break;
                }
                instruction = instructionMap.get(newKey);
            }
        }

        System.out.println(success);
        System.out.println(count);
    }

    public static Map<String, Instruction> getInputList() throws IOException {
        Map<String, Instruction> map = new HashMap<>();

        Files.readAllLines(Path.of("src/advance/input.txt"))
                .forEach(input -> {
                    String[] inputSplit = input.split(" = ");
                    String key = inputSplit[0];
                    String sec = inputSplit[1];
                    String[] split = sec
                            .replace("(", "")
                            .replace(")", "")
                            .split(", ");

                    Instruction instruction = new Instruction();
                    instruction.left = split[0];
                    instruction.right = split[1];
                    map.put(key, instruction);
                });
        return map;
    }

    public static class Instruction {
        private String left;
        private String right;

    }
}