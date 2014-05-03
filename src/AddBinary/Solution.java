package AddBinary;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public String addBinary(String a, String b) {
        ArrayList<Character> aList = new ArrayList<Character>();
        for (char c : a.toCharArray()) {
            aList.add(c);
        }
        Collections.reverse(aList);

        ArrayList<Character> bList = new ArrayList<Character>();
        for (char c : b.toCharArray()) {
            bList.add(c);
        }
        Collections.reverse(bList);

        ArrayList<Character> result = new ArrayList<Character>();
        int carry = 0;
        for (int i = 0; i < Math.max(aList.size(), bList.size()); i++) {
            int sum = carry;
            if (i < aList.size()) {
                sum += (aList.get(i) - '0');
            }
            if (i < bList.size()) {
                sum += (bList.get(i) - '0');
            }

            carry = sum / 2;
            sum = sum % 2;

            result.add(Character.toChars(sum + '0')[0]);
        }
        if (carry != 0) {
            result.add(Character.toChars(carry + '0')[0]);
        }
        Collections.reverse(result);

        StringBuilder sb = new StringBuilder();
        for (char c : result) {
            sb.append(c);
        }
        return String.valueOf(sb);
    }
}
