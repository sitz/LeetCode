package TrappingRainWater;

/**
 * Created by sitesh on 6/5/14.
 */
public class Solution {
    public int trap(int[] A) {
        int[] leftMax = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            leftMax[i] = A[i];
            if (i > 0) {
                leftMax[i] = Math.max(leftMax[i], leftMax[i - 1]);
            }
        }
        int[] rightMax = new int[A.length];
        for (int i = A.length - 1; i >= 0; i--) {
            rightMax[i] = A[i];
            if (i < A.length - 1) {
                rightMax[i] = Math.max(rightMax[i], rightMax[i + 1]);
            }
        }

        int trappedWater = 0;
        for (int i = 0; i < A.length; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - A[i];
        }

        return trappedWater;
    }
}
