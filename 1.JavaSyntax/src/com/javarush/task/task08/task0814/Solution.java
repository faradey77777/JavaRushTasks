package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> ras = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            ras.add(i);
        }
        return ras;
    }


    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> asd = set.iterator();
        while (asd.hasNext()) {
            if (asd.next() > 10) {
                asd.remove();
            }

        }
        return set;
    }

    public static void main(String[] args) {

    }
}
