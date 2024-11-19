package done;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();

        if (digits.length() == 0) return res;

        Map<Character, List<Character>> combinationMap = new HashMap<>();
        combinationMap.put('2', List.of('a','b','c'));
        combinationMap.put('3', List.of('d','e','f'));
        combinationMap.put('4', List.of('g','h','i'));
        combinationMap.put('5', List.of('j','k','l'));
        combinationMap.put('6', List.of('m','n','o'));
        combinationMap.put('8', List.of('t','u','v'));
        combinationMap.put('7', List.of('p','q','r','s'));
        combinationMap.put('9', List.of('w','x','y','z'));

        solve(digits, 0, res, new StringBuilder(), combinationMap);
        return res;
    }

    private void solve(String digits, int index, List<String> res, StringBuilder builder,
                          Map<Character, List<Character>> combinationMap) {
        if (index == digits.length()) {
            res.add(builder.toString());
            return;
        }

        List<Character> letters = combinationMap.get(digits.charAt(index));

        for (char letter : letters) {
            builder.append(letter);
            solve(digits, index + 1, res, builder, combinationMap);
            builder.deleteCharAt(builder.length() - 1);
        }
    }

}
