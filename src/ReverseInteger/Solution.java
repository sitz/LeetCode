package ReverseInteger;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);

        long reverseX = 0;
        while (x > 0) {
            reverseX = reverseX * 10 + x % 10;
            x /= 10;
        }
        if (isNegative) {
            reverseX *= -1;
        }
        if (reverseX > Integer.MAX_VALUE || reverseX < Integer.MIN_VALUE) {
            reverseX = 0;
        }
        return (int) reverseX;
    }
}