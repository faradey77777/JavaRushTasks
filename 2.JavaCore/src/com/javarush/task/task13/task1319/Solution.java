package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String z = reader.readLine();
        FileWriter fileWriter = new FileWriter(z);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        String s = "";
        while (!(s = reader.readLine()).equals("exit")) {
            writer.write(s);
            writer.newLine();
        }
        writer.write(s);
        reader.close();
        writer.close();
    }

    }