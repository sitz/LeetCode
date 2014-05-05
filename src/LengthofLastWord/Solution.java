package LengthofLastWord;

/**
 * Created by sitesh on 6/5/14.
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");

        return words.length == 0 ? 0 : words[words.length - 1].length();
    }
}
