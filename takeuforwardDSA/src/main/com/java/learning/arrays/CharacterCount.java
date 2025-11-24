package com.java.learning.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "aaaabbbpppeeeddaaapppbbascccaazzzpppyyy";

        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 1; i < str.length(); i++) {
            char value = str.charAt(0);
            int cnt = 1;
            map.put(value, cnt);
            if (map.get(str.charAt(i)) == str.charAt(i)) {
                map.put(str.charAt(i), cnt++);
            }
        }
        map.forEach((k, v) -> {
            System.out.println(k + ", " + v);
        });

    }
}
