package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("мама");
        list.add("мыла");
        list.add("раму");

     list.add(list.indexOf("мама")+1,"именно");
        list.add(list.indexOf("мыла")+1,"именно");
        list.add(list.indexOf("раму")+1,"именно");

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
