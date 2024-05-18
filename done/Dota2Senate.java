package done;

import java.util.ArrayDeque;
import java.util.Queue;

public class Dota2Senate {

    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new ArrayDeque<>();
        Queue<Integer> d = new ArrayDeque<>();

        int i;
        for (i = 0; i < senate.length(); i++) {
            char at = senate.charAt(i);
            if (at == 'R') {
                r.add(i);
            } else {
                d.add(i);
            }
        }

        while (!r.isEmpty() && !d.isEmpty()) {
            if (r.peek() < d.peek()) {
                r.add(i++);
            } else {
                d.add(i++);
            }
            r.poll(); d.poll();

//            System.out.println(r);
//            System.out.println(d);
//            System.out.println();
        }

        if (r.isEmpty()) {
            return "Dire";
        } else {
            return "Radiant";
        }
    }

}
