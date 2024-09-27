package done;

import java.util.ArrayList;
import java.util.List;

class Event {
    int start;
    int end;

    Event(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MyCalendarTwo {
    private final List<Event> bookings;
    private final List<Event> overlapped;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlapped = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (Event event : overlapped) {
            if (Math.max(event.start, start) < Math.min(event.end, end)) {
                return false;
            }
        }
        for (Event event : bookings) {
            int maxStart = Math.max(event.start, start);
            int minEnd = Math.min(event.end, end);
            if (maxStart < minEnd) {
                overlapped.add(new Event(maxStart, minEnd));
            }
        }
        bookings.add(new Event(start, end));

        return true;
    }
}
