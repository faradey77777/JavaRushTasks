package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String,Integer> maps = new HashMap<>();
        for(int i =0;i<10;i++) {
            maps.put("Sre"+i,498+i);
        }
        return maps;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> pair = new HashMap<>();
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue()<500){
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}