package agileEngine;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

class VisitCounter {

    Map<Long, Long> count(Map<String, UserStats>... visits) {
        if (visits == null)
            return new HashMap<>();

        return Stream.of(visits)
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> entry.getValue() != null && isParsable(entry.getKey()))
                .map(entry -> Long.parseLong(entry.getKey()))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    private static boolean isParsable(String key) {
        try {
            Long.parseLong(key);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
