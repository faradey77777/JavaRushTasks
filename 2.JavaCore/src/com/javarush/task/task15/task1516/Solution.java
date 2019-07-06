package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;


    public static void main(String[] args) {
        Solution sal = new Solution();


        System.out.println(sal.intVar);
        System.out.println(sal.doubleVar);
        System.out.println(sal.DoubleVar);
        System.out.println(sal.booleanVar);
        System.out.println(sal.ObjectVar);
        System.out.println(sal.ExceptionVar);
        System.out.println(sal.StringVar);

    }
}
