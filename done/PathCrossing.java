package done;

import java.util.ArrayList;
import java.util.List;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        List<Coordinates> coordinates = new ArrayList<>();
        Coordinates cur = new Coordinates(0,0);
        coordinates.add(cur);
        for (char ch : path.toCharArray()) {
            int x = cur.x;
            int y = cur.y;
            switch (ch) {
                case 'N': {
                    y++;
                    break;
                }
                case 'E': {
                    x++;
                    break;
                }
                case 'S': {
                    y--;
                    break;
                }
                case 'W': {
                    x--;
                    break;
                }
            }
            var a = new Coordinates(x,y);

            if (coordinates.contains(a)) {
                return true;
            }
            coordinates.add(a);
            cur = a;
        }
        return false;
    }

    public static class Coordinates {
        private int x;
        private int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Coordinates: x=" + x + "; y=" + y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Coordinates)) {
                return false;
            }
            Coordinates coordinates = (Coordinates) obj;
            if (this.x == coordinates.x && this.y == coordinates.y) {
                return true;
            }
            return false;
        }
    }
}
