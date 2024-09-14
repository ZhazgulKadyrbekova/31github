package contest.d140924;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        var solution = new FindaSafeWalkThroughaGrid();

        int[][] arr = {{0,1,0,0,0},{0,1,0,1,0},{0,0,0,1,0}};
        List<List<Integer>> list = new ArrayList<>();

        // Convert the 2D array to List<List<Integer>>
        for (int i = 0; i < arr.length; i++) {
            List<Integer> row = new ArrayList<>();  // Create a new list for each row
            for (int j = 0; j < arr[i].length; j++) {
                row.add(arr[i][j]);  // Add each element of the row to the list
            }
            list.add(row);  // Add the row list to the outer list
        }
        System.out.println(solution.findSafeWalk(list, 1));
    }
}
