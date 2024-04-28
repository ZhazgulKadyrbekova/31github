public class Solution {
    public static void main(String[] args) {
        var solution = new AsteroidCollision();

//        int[] res = solution.asteroidCollision(new int[] {10,2,-5});
//        int[] res = solution.asteroidCollision(new int[] {10,2,-5,5,10,-5});
        int[] res = solution.asteroidCollision(new int[] {-10,2,-5,5,10,-5});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
