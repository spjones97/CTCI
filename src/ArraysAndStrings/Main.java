package ArraysAndStrings;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String unique = "abcdefghijklmnopqrstuvwxyz";
        String notUnique = "abcdefghijklmnopqrstuvwxyzz";
        System.out.println(isUnique(unique) ? "correct" : "error");
        System.out.println(isUnique(notUnique) ? "error" : "correct");
    }

    /*
    Is Unique:
    Implement an algorithm to determine if a string has all unique characters
    What if you cannot use additional data structures>
     */
    public static boolean isUnique(String string) {
//        for (int i = 0; i < string.length(); i++) {
//            for (int j = i + 1; j < string.length(); j++) {
//                if (string.charAt(i) == string.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if (!set.add(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
