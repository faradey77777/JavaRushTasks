package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String elementClassName = stack[2].getClassName();
        String elementMethodName = stack[2].getMethodName();
//        System.out.println(stack[1].getClassName());
//        System.out.println(stack[2].getMethodName());
        System.out.println(elementClassName + ": " + elementMethodName + ": " + s);
    }
}
