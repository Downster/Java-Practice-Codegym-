package com.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        set.removeIf(x -> x > 10);
        return set;

    }

    public static void main(String[] args) {
        HashSet<Integer> setty = createSet();
        removeAllNumbersGreaterThan10(setty);

    }
}
