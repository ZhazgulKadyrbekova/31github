import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int start = 0, end = people.length - 1, count = 0;
        while (start <= end) {
            if (people[start] + people[end] <= limit) {
                start++;
            }
            end--;
            count++;
        }

        return count;
    }
}
