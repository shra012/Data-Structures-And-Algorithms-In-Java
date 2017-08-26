package com.shrvn.chapterone.creativity;

public class creativity22 {
    public static void main(String[] args) {
        char[] array = {'c', 'a', 't', 'd', 'o', 'g'};
        String s = new String(array);
        System.out.println("All possible strings");
        permute("", s);
    }

    private static void permute(String res, String str) {
        if (str.length() == 0)
            System.out.println(res);

        for (int i = 0; i < str.length(); ++i) {
            permute(res + str.charAt(i), str.replace(String.valueOf(str.charAt(i)), ""));
        }
    }
}
