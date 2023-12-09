package contest.d091223;

//Remove Adjacent Almost-Equal Characters
public class RemoveAdjacentAlmostEqualCharacters {
    public static void main(String[] args) {
        String word = "aaaaaba";

        System.out.println(removeAlmostEqualCharacters(word));
    }

    public static int removeAlmostEqualCharacters(String word) {
        var size = word.length();
        var count = 0;
        for (int i = 1; i < size; i++) {
            if (isAlmostEqual(word.charAt(i), word.charAt(i - 1))) {
                count++;
                i++;
            }
        }
        return count;
    }

    public static boolean isAlmostEqual(char i, char j) {
        return Math.abs(i - j) <= 1;
    }
}