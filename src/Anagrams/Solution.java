package Anagrams;

import java.util.*;

/**
 * Created by sitesh on 3/5/14.
 */
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<String, List<String>>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedKey = String.valueOf(chars);

            if (!anagramMap.containsKey(sortedKey)) {
                anagramMap.put(sortedKey, new ArrayList<String>());
            }
            anagramMap.get(sortedKey).add(str);
        }

        ArrayList<String> anagramList = new ArrayList<String>();
        for (String anagramKey : anagramMap.keySet()) {
            if (anagramMap.get(anagramKey).size() > 1) {
                for (String anagramWord : anagramMap.get(anagramKey)) {
                    anagramList.add(anagramWord);
                }
            }
        }

        return anagramList;
    }
}