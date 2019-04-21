package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        ArrayList<Character> wordsCharList = new ArrayList<Character>(); //создаем коллекцию для хранения символов
        for(int i = 0; i < list.size(); i++){
            char [] ch = list.get(i).toCharArray(); //переводим слова в масив символов
            for(int j = 0; j < ch.length; j++){
                wordsCharList.add(ch[j]); //добавляем полученные символы в масив
            }
        }
        for(int i = 0; i < alphabet.size(); i++){ //перебераем наш алфавит
            int value = 0;  // целочисленная переменная для хранения количества повтторений
            for (Character c : wordsCharList) { //сравниваем символ алфавита под интексом і с каждим элементом масива символов полученого из слов
                if (alphabet.get(i).equals(c)) {
                    value++; // добавляем 1 если символы равны
                }
            }
            System.out.println(alphabet.get(i)+" "+value); //печатаем на экран символ под индексом(который мы проверяли)
            // и соответсвующее значение value количества повторений символа
            // после этого значение value становиться снова равно нулю = 0, ведь
            // цикл начинаеться заново
        }


    }

}
