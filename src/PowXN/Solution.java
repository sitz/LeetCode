package PowXN;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public double pow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;

        double result = pow(x, n / 2);
        result *= result;
        if (n % 2 != 0) {
            if (n < 0) {
                result /= x;
            } else {
                result *= x;
            }
        }

        return result;
    }
}
