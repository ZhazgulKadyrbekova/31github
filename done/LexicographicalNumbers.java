package done;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    List<Integer> list = new ArrayList<>();

    public List<Integer> lexicalOrder(int n) {
        fillTheList(1, n);
        return list;
    }

    public void fillTheList(int base, int limit) {
        if (!insideLimits(base, limit)) {
            return;
        }

        list.add(base);
        fillTheList(base * 10, limit);
        if ((base + 1) % 10 != 0)
            fillTheList(base + 1, limit);
    }

    public boolean insideLimits(int number, int n) {
        return number > 0 && number <= n;
    }
}
