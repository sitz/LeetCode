package Searcha2DMatrix;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int minRow = 0;
        int maxRow = matrix.length - 1;

        int minCol = 0;
        int maxCol = matrix[0].length - 1;

        int row = minRow;
        int col = maxCol;

        while (row <= maxRow && col >= minCol) {
            if (target < matrix[row][col]) --col;
            else if (target > matrix[row][col]) ++row;
            else return true;
        }

        return false;
    }
}
