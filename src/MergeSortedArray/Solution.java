package MergeSortedArray;

/**
 * Created by sitesh on 4/5/14.
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int aIndex = m - 1;
        int bIndex = n - 1;

        for (int index = m + n - 1; index >= 0; index--) {
            if (bIndex < 0 || (aIndex >= 0 && A[aIndex] > B[bIndex])) {
                A[index] = A[aIndex--];
            } else {
                A[index] = B[bIndex--];
            }
        }
    }
}
