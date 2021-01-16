package ArraysAndStrings;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String unique = "abcdefghijklmnopqrstuvwxyz";
        String notUnique = "abcdefghijklmnopqrstuvwxyzz";
        System.out.println(isUnique(unique) ? "correct" : "error");
        System.out.println(isUnique(notUnique) ? "error" : "correct");

        String[] perms = { "abcdefg", "bcefdag" };
        System.out.println(checkPermutation(perms[0], perms[1]) ? "correct" : "error");
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

    /*
    Check Permutation:
    Given two strings, write a method to decide if one is a permutation of the other
     */
    public static boolean checkPermutation(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }

        char[] arr = strOne.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < strTwo.length(); j++) {
                if (arr[i] == strTwo.charAt(j)) {
                    arr[i] = '0';
                    break;
                }
            }
        }

        for (char c : arr) {
            if (c != '0') {
                return false;
            }
        }

        return true;
    }
}
