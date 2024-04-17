package usergems;

import java.util.*;

@SuppressWarnings({"ArraysAsListWithZeroOrOneArgument", "SlowListContainsAll"})
public class RedundantJobTitlesTask {
    /* Find all redundant entries in the haystack array where an entry in the needles array covers all or part of a haystack item.
     * E.g.: The entry "Software Engineer" in the haystack is redundant because the needles array includes an entry "Software".
     * "Hardware VP Engineering" is redundant because of "VP Engineering"
     * "Hardware VP" is NOT considered redundant for "VP Engineering" because only the word "VP" matches and only full matches of "VP Engineering" count
     * "Director" is not considered redundant for "cto" because only full word matches count
     */

    private List<String> findRedundantKeywords(List<String> needles, List<String> haystack) {
        List<String> res = new ArrayList<>();

        for (String sentence : haystack) {
            for (String needle : needles) {

                if (check(sentence, needle)) {
                    System.out.println(sentence);
                    res.add(sentence);
                    break;
                }
            }
        }

       return res;
    }

    private boolean check(String sentence, String needle) {
        if (sentence.contains(needle +" ")) {
            return true;
        }
        if (sentence.contains(" " + needle)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        new RedundantJobTitlesTask().test();
    }

    private void test() {
        List<Map<String, List<String>>> tests = Arrays.asList(
                new HashMap<String, List<String>>(){{
                        put("needles", Arrays.asList("Software", "cto", "VP Engineering"));
                        put("haystack", Arrays.asList("Software Engineer", "Director", "Hardware VP Engineering"));
                        put("output", Arrays.asList("Software Engineer", "Hardware VP Engineering"));
                }},
                new HashMap<String, List<String>>(){
                    {
                        put("needles", Arrays.asList("Software", "cto", "VP Engineering"));
                        put("haystack", Arrays.asList("Software Engineer", "Director", "Hardware VP"));
                        put("output", Arrays.asList("Software Engineer"));
                    }}
        );

        for (Map<String, List<String>> test : tests) {
            List<String> actualOutput = findRedundantKeywords(test.get("needles"), test.get("haystack"));
            List<String> expectedOutput = test.get("output");
            if (actualOutput.containsAll(expectedOutput) && expectedOutput.containsAll(actualOutput)) {
                System.out.println("Tests success");
            } else {
                System.err.println("Test failed");
            }
        }
    }
}
