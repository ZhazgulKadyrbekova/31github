package box;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Transaction {
    private List<HashMap<String, String>> mapList = new ArrayList<>();
    private int size = 0;
    private HashMap<String, String> currentMap = new HashMap<>();

    public void begin() {
        mapList.add(currentMap);
        size++;
        currentMap = new HashMap<>(currentMap);
    }

    public void commit() {
        if (size <= 0) {
            System.out.println("NO TRANSACTION");
            return;
        }
        //no need to use a list if current map includes all recent changes
        mapList.add(currentMap);
        currentMap = new HashMap<>();
        mapList.forEach(hashMap -> currentMap.putAll(hashMap));

        mapList = Collections.singletonList(currentMap);
        size = 0;
    }

    public void rollback() {
        if (size <= 0) {
            System.out.println("NO TRANSACTION");
            return;
        }
        currentMap = mapList.get(size);
        mapList.remove(size);
        size--;
    }

    public void set(String key, String value) {
        currentMap.put(key, value);
    }

    public String get(String key) {
        return currentMap.getOrDefault(key, "NULL");
    }

    public void delete(String key) {
        currentMap.remove(key);
    }

    public long count(String value) {
        return currentMap.values().stream().filter(it -> it.equals(value)).count();
    }

}
