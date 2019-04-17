package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        Cat cat1 = new Cat("Питрович1");
        Cat cat2 = new Cat("Патрович2");
        Cat cat3 = new Cat("Путрович3");
        Cat cat4 = new Cat("Петрович4");
        Cat cat5 = new Cat("Пётрович5");
        Cat cat6 = new Cat("Пятрович6");
        Cat cat7 = new Cat("Пытрович7");
        Cat cat8 = new Cat("Пютрович8");
        Cat cat9 = new Cat("Пиитрович9");
        Cat cat10 = new Cat("Пиетрович10");

        map.put(cat1.name, cat1);
        map.put(cat2.name, cat2);
        map.put(cat3.name, cat3);
        map.put(cat4.name, cat4);
        map.put(cat5.name, cat5);
        map.put(cat6.name, cat6);
        map.put(cat7.name, cat7);
        map.put(cat8.name, cat8);
        map.put(cat9.name, cat9);
        map.put(cat10.name, cat10);

        return (map);
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet();
        for (Map.Entry<String,Cat> m : map.entrySet()){
            set.add(m.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
