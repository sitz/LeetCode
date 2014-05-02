package SingleNumber;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public int singleNumber(int[] A) {
        int desiredNumber = 0;
        for (int a : A) {
            desiredNumber ^= a;
        }

        return desiredNumber;
    }
}
