package PascalsTriangleII;

import java.util.ArrayList;

/**
 * Created by sitesh on 6/5/14.
 */
public class Solution {
    public ArrayList<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<Integer>() {{
            add(1);
        }};

        ArrayList<Integer> previousPascalRow = getRow(rowIndex - 1);
        ArrayList<Integer> currentPascalRow = new ArrayList<Integer>();
        currentPascalRow.add(1);
        for (int i = 1; i < previousPascalRow.size(); i++) {
            currentPascalRow.add(previousPascalRow.get(i - 1) + previousPascalRow.get(i));
        }
        currentPascalRow.add(1);

        return currentPascalRow;
    }
}
