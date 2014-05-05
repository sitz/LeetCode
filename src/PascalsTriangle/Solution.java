package PascalsTriangle;

import java.util.ArrayList;

/**
 * Created by sitesh on 6/5/14.
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> pascalTriangle = new ArrayList<ArrayList<Integer>>();

        for (int row = 0; row < numRows; row++) {
            ArrayList<Integer> currentPascalRow = new ArrayList<Integer>();
            if (row == 0) {
                currentPascalRow.add(1);
            } else {
                currentPascalRow.add(1);
                for (int col = 1; col < pascalTriangle.get(row - 1).size(); col++) {
                    currentPascalRow.add(pascalTriangle.get(row - 1).get(col - 1) + pascalTriangle.get(row - 1).get(col));
                }
                currentPascalRow.add(1);
            }

            pascalTriangle.add(currentPascalRow);
        }

        return pascalTriangle;
    }
}
