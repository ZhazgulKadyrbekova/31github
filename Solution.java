import done.RotateArray;

public class Solution {
    public static void main(String[] args) {
        var solution = new RotateArray();

//        int[] arr = new int[] {1,2,3,4,5,6,7};
//        solution.rotate(arr, 3);

        int[] arr = new int[] {1,2,3,4,5,6,7};
        solution.rotate(arr, 5);

//        int[] arr = new int[] {-1,-100,3,99};
//        solution.rotate(arr, 2);

        for (int i : arr) {
            System.out.println(i);
        }
    }

}
