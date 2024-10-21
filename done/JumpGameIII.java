package done;

import java.util.List;
import java.util.Stack;

public class JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        Stack<Integer> stack = new Stack<>();
        boolean[] reached = new boolean[arr.length];

        stack.add(start);

        while (!stack.isEmpty()) {
            int index = stack.pop();

//            System.out.println(index);
//            System.out.println(Arrays.toString(reached));
//            System.out.println(stack);
//            System.out.println();

            if (reached[index]) {
                continue;
            }

            if (arr[index] == 0) {
                return true;
            }

            reached[index] = true;

            if (index - arr[index] >= 0) {
                stack.add(index - arr[index]);
            }
            if (index + arr[index] < arr.length) {
                stack.add(index + arr[index]);
            }
        }
        return false;
    }

    private boolean bfs2(int index, int[] arr, List<Integer> reached) {
        if (index < 0 || index >= arr.length || reached.contains(index)) {
            return false;
        }

        if (arr[index] == 0) {
            return true;
        }

        reached.add(index);
        return bfs2(index - arr[index], arr, reached)
                || bfs2(index + arr[index], arr, reached);

    }
}
