package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int a,int b){
        double d=a;
        double c=b;
        return (int)min(d,c);}
    public static long min(long a,long b){
        double d=a;
        double c=b;
        return Math.min(a, b);    }
    public static double min(double a,double b){
        return Math.min(a,b);
    }
}