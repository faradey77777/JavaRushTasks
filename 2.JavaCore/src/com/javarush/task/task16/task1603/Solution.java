package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread object1 = new SpecialThread();
        Thread child1 = new Thread(object1);
        list.add(child1);

        SpecialThread object2 = new SpecialThread();
        Thread child2 = new Thread(object2);
        list.add(child2);

        SpecialThread object3 = new SpecialThread();
        Thread child3 = new Thread(object3);
        list.add(child3);

        SpecialThread object4 = new SpecialThread();
        Thread child4 = new Thread(object4);
        list.add(child4);

        SpecialThread object5 = new SpecialThread();
        Thread child5 = new Thread(object5);
        list.add(child5);

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
