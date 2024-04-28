package done;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.lastElement() > 0) {
                int dif = asteroid + stack.lastElement();
                if (dif > 0) {
                    asteroid = 0;
                }
                else if (dif < 0) {
                    stack.pop();
                }
                else {
                    stack.pop();
                    asteroid = 0;
                }
            }
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] asteroidCollision2(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && stack.lastElement() > 0 && stack.lastElement() < -asteroid) {
                stack.pop();
            }

            if (stack.isEmpty() || asteroid > 0 || stack.lastElement() < 0) {
                stack.push(asteroid);
            }
            else if (asteroid < 0 && stack.lastElement() == -asteroid) {
                stack.pop();
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

}
