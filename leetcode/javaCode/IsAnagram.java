package leetcode.javaCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IsAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        List<String> sList = Arrays.asList(s.split(""));
        List<String> tList = Arrays.asList(t.split(""));

        Collections.sort(sList);

        Collections.sort(tList);

        return sList.equals(tList);
    }

    public static void main(String[] args) {
        IsAnagram isAnagram = new IsAnagram();
        System.out.println(isAnagram.isAnagram("anagram", "nagaram"));
    }
}
