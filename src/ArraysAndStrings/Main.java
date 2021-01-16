package ArraysAndStrings;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] uniques = { "abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyzz" };
        System.out.println(isUnique(uniques[0]) ? "correct" : "error");
        System.out.println(isUnique(uniques[1]) ? "error" : "correct");

        String[] perms = { "abcdefg", "bcefdag", "abc", "def" };
        System.out.println(checkPermutation(perms[0], perms[1]) ? "correct" : "error");
        System.out.println(checkPermutation(perms[2], perms[3]) ? "error" : "correct");

        String[] urls = { "Mr John Smith   ", "Hello world my name is" };
        System.out.println((URLify(urls[0], 13).equals("Mr%20John%20Smith")) ? "correct" : "error");
        System.out.println((URLify(urls[1], 22).equals("Hello%20world%20my%20name%20is")) ? "correct" : "error");
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

    /*
    URLify:
    Write a method to replace all spaces in a string with '%20'.
    You may assume that the string has sufficient space at the end to hold the additional characters,
    and that you are given the "true" length of the string.
     */
    public static String URLify(String str, int length) {
        char[] arr = str.toCharArray();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                out.append("%20");
            } else {
                out.append(arr[i]);
            }
        }

        return out.toString();
    }
}
