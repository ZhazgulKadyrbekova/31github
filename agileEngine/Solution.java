package agileEngine;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        VisitCounter vc = new VisitCounter();
        Map<String, UserStats> map = new HashMap<>();

        map.put("112", new UserStats(12L));
        Map<Long, Long> count = vc.count(map);
        count.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        map.put("112A", new UserStats(12L));
        count = vc.count(map);
        count.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        map.put("112", null);
        count = vc.count(map);
        count.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        map.put("112", new UserStats(null));
        count = vc.count(map);
        count.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });

        vc.count(null);
        count = vc.count(new HashMap<>());
        count.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });


        // Example usage
//        Map<String, UserStats> map1 = Map.of("1", new UserStats(12L), "2", new UserStats(12L));
//        Map<String, UserStats> map2 = Map.of("2", new UserStats(12L), "3", new UserStats(12L));
//
//        Map<Long, Long> keyCount = vc.count(map1, map2);
//
//        keyCount.forEach((key, count) -> {
//            System.out.println(key + ": " + count);
//        });
    }

}
