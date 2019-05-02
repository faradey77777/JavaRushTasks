package com.javarush.task.task14.task1414;

/*
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        boolean a = true;
        while (a){

            if (s.equals("cartoon")|| s.equals("thriller") || s.equals("soapOpera")) {
                MovieFactory.getMovie(s).getClass().getSimpleName();
            }
            else a = false;
        }





        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;


            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
                
            }
            if ("Cartoon".equals(key)) {
                movie = new Cartoon();

            }
            if ("Thriller".equals(key)) {
                movie = new Thriller();

            }


            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }
}
