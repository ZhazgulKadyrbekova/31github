import nonsolved.SetMatrixZeroes;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        var solution = new SetMatrixZeroes();
        var arr = new int[][] {{1,1,1},{0,1,1},{1,1,1}};

        solution.setZeroes(arr);
        for (int a[] : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

}
