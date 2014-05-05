package Triangle;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sitesh on 5/5/14.
 */
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        for (int row = 1; row < triangle.size(); row++) {
            for (int col = 0; col < triangle.get(row).size(); col++) {
                int currentVal = Integer.MAX_VALUE;
                if (col > 0) {
                    currentVal = Math.min(currentVal, triangle.get(row - 1).get(col - 1));
                }
                if (col < triangle.get(row - 1).size()) {
                    currentVal = Math.min(currentVal, triangle.get(row - 1).get(col));
                }

                currentVal += triangle.get(row).get(col);
                triangle.get(row).set(col, currentVal);
            }
        }

        return Collections.min(triangle.get(triangle.size() - 1));
    }
}
