import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        Set<Coordinates> coordinates = new HashSet<>();
        Coordinates cur = new Coordinates(0,0);
        coordinates.add(cur);
        for (char ch : path.toCharArray()) {
            int startSize = coordinates.size();
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
            coordinates.add(a);
            cur = a;
            if (coordinates.size() == startSize) {
                return true;
            }
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
        public int hashCode() {
            String a = x + "" + y;
            return Integer.parseInt(a);
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
            if (this.hashCode() == coordinates.hashCode()) {
                return true;
            }
            return false;
        }
    }
}
