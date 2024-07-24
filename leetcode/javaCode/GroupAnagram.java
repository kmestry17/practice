package leetcode.javaCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> sortMap = new HashMap<>();

        for (String str : strs) {

            List<String> charStrArr = Arrays.asList(str.split(""));

            Collections.sort(charStrArr);

            String sortedString = String.join("", charStrArr);

            if (!sortMap.containsKey(sortedString)) {
                sortMap.put(sortedString, new ArrayList<>());
            }
            sortMap.get(sortedString).add(str);

        }

        return new ArrayList<>(sortMap.values());
    }

    public static void main(String[] args) {
        GroupAnagram groupAnagram = new GroupAnagram();
        System.out.println(groupAnagram.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));

    }
}
